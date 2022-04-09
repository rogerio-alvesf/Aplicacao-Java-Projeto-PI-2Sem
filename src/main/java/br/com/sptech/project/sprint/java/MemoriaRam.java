package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class MemoriaRam {

    private String total;
    private String uso;
    private String disponivel;

    Looca maquina = new Looca();

    public MemoriaRam(String total, String uso, String disponivel) {
        this.total = total;
        this.uso = uso;
        this.disponivel = disponivel;
    }
    
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(String disponivel) {
        this.disponivel = disponivel;
    }

    public void armazenarInformacoesMemoriaRam() {
        setTotal(maquina.getMemoria().getTotal().toString());
    }

    public void armazenarStatusMemoriaRam() {
        setUso(maquina.getMemoria().getEmUso().toString());
        setDisponivel(maquina.getMemoria().getDisponivel().toString());
    }

    public String exibirInformacoesMemoriaRam() {
        return this.total;
    }

    public String exibirStatusMemoriaRam() {
        return String.format("Valor uso da Memória RAM: %s\n"
                + "Valor disponível da Memória RAM: %s\n",
                this.uso,
                this.disponivel);
    }
}
