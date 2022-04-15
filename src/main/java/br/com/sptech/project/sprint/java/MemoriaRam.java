package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class MemoriaRam {

    private Long total;
    private Long uso;
    private Long disponivel;

    Looca maquina = new Looca();

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

    public void armazenarInformacoesMemoriaRam() {
        total = maquina.getMemoria().getTotal();
    }

    public void armazenarStatusMemoriaRam() {
        uso = maquina.getMemoria().getEmUso();
        disponivel = maquina.getMemoria().getDisponivel();
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
