package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class Processador {

    private String nome;
    private String uso;
    private String frequencia;

    Looca maquina = new Looca();

    public Processador() {
        this.nome = "";
        this.uso = "";
        this.frequencia = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }

    public void consultarInformacoesCpu() {
        setNome(maquina.getProcessador().getNome());
    }

    public void constultarStatusCpu() {
        setFrequencia(maquina.getProcessador().getFrequencia().toString());
        setUso(maquina.getProcessador().getUso().toString());
    }
}
