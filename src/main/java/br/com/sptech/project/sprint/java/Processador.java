package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class Processador {

    private String nome;
    private Double uso;
    private Long frequencia;

    Looca maquina = new Looca();

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
    
    public void armazenarInformacoesCpu() {
        nome = maquina.getProcessador().getNome();
    }

    public void armazenarStatusCpu() {
        frequencia = maquina.getProcessador().getFrequencia();
        uso = maquina.getProcessador().getUso();
    }

    public String exibirInformacoesCpu() {
        return nome;
    }

    public String exibirStatusCpu() {
        return String.format("Frequencia atual do CPU da máquina: %s\n"
                + "Valor uso da CPU: %.2f\n", frequencia, uso);
    }
}
