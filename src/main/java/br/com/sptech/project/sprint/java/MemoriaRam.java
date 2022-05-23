package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;
import infrastructure.GravacaoLogs;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import modelsAzure.MemoriaRamModel;

public class MemoriaRam {

    private Long total;
    private Long uso;
    private Long disponivel;

    Looca maquina = new Looca();

    GravacaoLogs logs = new GravacaoLogs();

    public MemoriaRam(Long total, Long uso, Long disponivel) {
        this.total = total;
        this.uso = uso;
        this.disponivel = disponivel;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getUso() {
        return uso;
    }

    public void setUso(Long uso) {
        this.uso = uso;
    }

    public Long getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Long disponivel) {
        this.disponivel = disponivel;
    }

    public void armazenarInformacoesMemoriaRam(Integer idMaquina) {
        if (MemoriaRamModel.verificarInformacoes(idMaquina) == false) {
            total = maquina.getMemoria().getTotal();
            MemoriaRamModel.armazenarInformacoes(idMaquina, total);
            return;
        }
        System.out.println("Memoria Ram já está cadastrada.");
    }

    public void armazenarStatusMemoriaRam(Integer idMaquina) throws IOException {
        uso = maquina.getMemoria().getEmUso();
        disponivel = maquina.getMemoria().getDisponivel();
        String informacoesLogs = String.format("Maquina %d \n"
                + "Memória em uso: %s\n"
                + "Memória disponivel: %s\n", idMaquina, maquina.getMemoria().getEmUso(), maquina.getMemoria().getDisponivel())
                + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "\n....................................................................................................";

        GravacaoLogs.teste(informacoesLogs);
        MemoriaRamModel.armazenarStatus(idMaquina, uso, disponivel);
    }

    public Long exibirInformacoesMemoriaRam() {
        return this.total;
    }

    public String exibirStatusMemoriaRam() {
        return String.format("Valor uso da Memória RAM: %d\n"
                + "Valor disponível da Memória RAM: %d\n",
                uso,
                disponivel);
    }
}
