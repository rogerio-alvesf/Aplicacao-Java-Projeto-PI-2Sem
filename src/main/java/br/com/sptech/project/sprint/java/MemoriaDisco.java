package br.com.sptech.project.sprint.java;

import java.util.ArrayList;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import com.github.britooo.looca.api.group.discos.DiscosGroup;

public class MemoriaDisco {

    private Long valorTamanhoTotal;
    private String modelo;
    private Long valorEscrita;
    private Long valorLeituras;
    private Long valorTempoDeTransferencia;
    private Long espacoLivre;

    Looca maquina = new Looca();

    DiscosGroup Disco = new DiscosGroup();

    List<Disco> Discos = Disco.getDiscos();

    public MemoriaDisco(Long valorTamanhoTotal,
            String modelo,
            Long valorEscrita,
            Long valorLeituras,
            Long valorTempoDeTransferencia,
            Long espacoLivre) {
        this.valorTamanhoTotal = valorTamanhoTotal;
        this.modelo = modelo;
        this.valorEscrita = valorEscrita;
        this.valorLeituras = valorLeituras;
        this.valorTempoDeTransferencia = valorTempoDeTransferencia;
        this.espacoLivre = espacoLivre;
    }

    public Long getValorTamanhoTotal() {
        return valorTamanhoTotal;
    }

    public void setValorTamanhoTotal(Long valorTamanhoTotal) {
        this.valorTamanhoTotal = valorTamanhoTotal;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getValorEscrita() {
        return valorEscrita;
    }

    public void setValorEscrita(Long valorEscrita) {
        this.valorEscrita = valorEscrita;
    }

    public Long getValorLeituras() {
        return valorLeituras;
    }

    public void setValorLeituras(Long valorLeituras) {
        this.valorLeituras = valorLeituras;
    }

    public Long getValorTempoDeTransferencia() {
        return valorTempoDeTransferencia;
    }

    public void setValorTempoDeTransferencia(Long valorTempoDeTransferencia) {
        this.valorTempoDeTransferencia = valorTempoDeTransferencia;
    }

    public Long getEspacoLivre() {
        return espacoLivre;
    }

    public void setEspacoLivre(Long espacoLivre) {
        this.espacoLivre = espacoLivre;
    }

    public void armazenarInformacoesMemoriaDisco() {
        modelo = Discos.get(0).getModelo();
        valorTamanhoTotal = maquina.getGrupoDeDiscos().getTamanhoTotal();
    }

    public void armazenarStatusmMemoriaDisco() {
        espacoLivre = maquina.getGrupoDeDiscos().getTamanhoTotal() - Disco.getVolumes().get(0).getDisponivel();
        valorEscrita = Discos.get(0).getEscritas();
        valorLeituras = Discos.get(0).getLeituras();
        valorTempoDeTransferencia = Discos.get(0).getTempoDeTransferencia();
    }

    public List<String> exibirInformacoesMemoriaDisco() {
        List<String> dados = new ArrayList();
        for (int i = 0; i < Disco.getQuantidadeDeDiscos(); i++) {
            dados.add(String.format("Informações Da memória de disco: %d",
                    i + 1));
            dados.add(String.format("Modelo: %s",
                    Discos.get(i).getModelo()));
        }
        return dados;
    }

    public List<String> exibirStatusMemoriaDisco() {
        List<String> dados = new ArrayList();
        for (int i = 0; i < Disco.getQuantidadeDeDiscos(); i++) {
            dados.add(String.format("Dados sobre a memória de disco: %d",
                    i + 1));
            dados.add(String.format("Valor de escrita: %d",
                    Discos.get(i).getEscritas()));
            dados.add(String.format("Valor de leitura: %d",
                    Discos.get(i).getLeituras()));
            dados.add(String.format("Valor Tempo de transferencia: %d",
                    Discos.get(i).getTempoDeTransferencia()));
            /*String.format(
                    "Dados sobre a memória de disco: %d\n"
                    + "Valor de escrita: %s\n"
                    + "Valor de leitura: %s\n"
                    + "Valor Tempo de transferencia: %s\n",
                    i + 1,
                    Discos.get(i).getEscritas().toString(),
                    Discos.get(i).getLeituras().toString(),
                    Discos.get(i).getTempoDeTransferencia().toString());*/
        }
        return dados;
    }
}
