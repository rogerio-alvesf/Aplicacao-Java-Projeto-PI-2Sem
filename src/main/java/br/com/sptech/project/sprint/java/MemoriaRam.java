package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class MemoriaRam {
    private String total;
    private String uso;
    private String disponivel;
    
    Looca maquina = new Looca();

    public MemoriaRam() {
        this.total = "";
        this.uso = "";
        this.disponivel = "";
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
    
    public void consultarInformacoesMemoriaRam(){
        setTotal(maquina.getMemoria().getTotal().toString());
    }
    
    public void constultarStatusMemoriaRam(){
        setUso(maquina.getMemoria().getEmUso().toString());
        setDisponivel(maquina.getMemoria().getDisponivel().toString());
    }
    
}
