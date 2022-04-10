package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import com.github.britooo.looca.api.group.discos.DiscosGroup;

public class MemoriaDisco {

    private String valorTamanhoTotal;
    private String quantidadeDiscos;
    private String modelo;
    private String valorEscrita;
    private String valorLeituras;
    private String valorTempoDeTransferencia;

    Looca maquina = new Looca();

    DiscosGroup Disco = new DiscosGroup();

    List<Disco> Discos = Disco.getDiscos();

    public MemoriaDisco(String valorTamanhoTotal,
            String quantidadeDiscos,
            String modelo,
            String valorEscrita,
            String valorLeituras,
            String valorTempoDeTransferencia) {
        this.valorTamanhoTotal = valorTamanhoTotal;
        this.quantidadeDiscos = quantidadeDiscos;
        this.modelo = modelo;
        this.valorEscrita = valorEscrita;
        this.valorLeituras = valorLeituras;
        this.valorTempoDeTransferencia = valorTempoDeTransferencia;
    }

    public String getValorTamanhoTotal() {
        return valorTamanhoTotal;
    }

    public void setValorTamanhoTotal(String valorTamanhoTotal) {
        this.valorTamanhoTotal = valorTamanhoTotal;
    }

    public String getQuantidadeDiscos() {
        return quantidadeDiscos;
    }

    public void setQuantidadeDiscos(String quantidadeDiscos) {
        this.quantidadeDiscos = quantidadeDiscos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getValorEscrita() {
        return valorEscrita;
    }

    public void setValorEscrita(String valorEscrita) {
        this.valorEscrita = valorEscrita;
    }

    public String getValorLeituras() {
        return valorLeituras;
    }

    public void setValorLeituras(String valorLeituras) {
        this.valorLeituras = valorLeituras;
    }

    public String getValorTempoDeTransferencia() {
        return valorTempoDeTransferencia;
    }

    public void setValorTempoDeTransferencia(String valorTempoDeTransferencia) {
        this.valorTempoDeTransferencia = valorTempoDeTransferencia;
    }

    public void armazenarInformacoesMemoriaDisco() {
        setModelo(Discos.get(0).getModelo());
        setValorEscrita(Discos.get(0).getEscritas().toString());
        setValorLeituras(Discos.get(0).getLeituras().toString());
        setValorTempoDeTransferencia(Discos.get(0).getTempoDeTransferencia().toString());
    }

    public void armazenarStatusCpu() {
        setValorTamanhoTotal(maquina.getGrupoDeDiscos().getTamanhoTotal().toString());
    }
    
    public String exibirInformacoesMemoriaDisco(){
        return getModelo();
    }

    public String exibirStatusMemoriaDisco() {
        return String.format(
                "Quantidade de Disco na máquina: %s"
                + "Valor de escrita: %s\n"
                + "Valor de leitura: %s\n"
                + "Valor Tempo de transferencia: %s",
                this.quantidadeDiscos,
                this.valorEscrita,
                this.valorLeituras,
                this.valorTempoDeTransferencia);
    }
}
