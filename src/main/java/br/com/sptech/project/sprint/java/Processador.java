package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;
import infrastructure.GravacaoLogs;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import modelsAzure.ProcessadorModel;

public class Processador {

    private String nome;
    private Double uso;
    private Long frequencia;

    Looca maquina = new Looca();
    GravacaoLogs logs = new GravacaoLogs();

    public Processador(String nome, Double uso, Long frequencia) {
        this.nome = nome;
        this.uso = uso;
        this.frequencia = frequencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getUso() {
        return uso;
    }

    public void setUso(Double uso) {
        this.uso = uso;
    }

    public Long getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(Long frequencia) {
        this.frequencia = frequencia;
    }

    public void armazenarInformacoesCpu(Integer idMaquina) {
        if (ProcessadorModel.verificarInformacoes(idMaquina) == false) {
            nome = maquina.getProcessador().getNome();

            ProcessadorModel.armazenarInformacoes(idMaquina, nome);
            return;
        }
        System.out.println("Processador já está cadastrado.");
    }

    public void armazenarStatusCpu(Integer idMaquina) throws IOException {
        frequencia = maquina.getProcessador().getFrequencia();
        uso = maquina.getProcessador().getUso();
        ProcessadorModel.armazenarStatus(idMaquina, frequencia, uso);

        String informacoesLogs = String.format("Maquina: %d \n"
                + "Frequencia do processador: %s \n"
                + "Em uso: %.2f \n"
                + "", idMaquina, maquina.getProcessador().getFrequencia(), maquina.getProcessador().getUso())
                + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "\n....................................................................................................";

        GravacaoLogs.teste(informacoesLogs);
    }

    public String exibirInformacoesCpu() {
        return nome;
    }

    public String exibirStatusCpu() {
        return String.format("Frequencia atual do CPU da máquina: %s\n"
                + "Valor uso da CPU: %.2f\n", frequencia, uso);
    }
}
