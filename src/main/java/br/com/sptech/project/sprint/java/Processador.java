package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class Processador {

    private String nome;
    private String uso;
    private String frequencia;

    Looca maquina = new Looca();

    public Processador(String nome, String uso, String frequencia) {
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

    public void armazenarInformacoesCpu() {
        setNome(maquina.getProcessador().getNome());
    }

    public void armazenarStatusCpu() {
        setFrequencia(maquina.getProcessador().getFrequencia().toString());
        setUso(maquina.getProcessador().getUso().toString());
    }

    public String exibirInformacoesCpu() {
        return getNome();
    }

    public String exibirStatusCpu() {
        return String.format("Frequencia atual do CPU da máquina: %s\n"
                + "Valor uso da CPU: %s\n", this.frequencia, this.uso);
    }
}
