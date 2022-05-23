package br.com.sptech.project.sprint.java;

import java.util.ArrayList;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import com.github.britooo.looca.api.group.discos.DiscosGroup;
import infrastructure.GravacaoLogs;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import modelsAzure.MemoriaDiscoModel;

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

    GravacaoLogs logs = new GravacaoLogs();

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

    public void armazenarInformacoesMemoriaDisco(Integer idMaquina) {
        if (MemoriaDiscoModel.verificarInformacoes(idMaquina) == false) {
            for (int i = 0; i < Disco.getQuantidadeDeDiscos(); i++) {
                modelo = Discos.get(i).getModelo();
                valorTamanhoTotal = maquina.getGrupoDeDiscos().getDiscos().get(i).getTamanho();
                MemoriaDiscoModel.armazenarInformacoes(idMaquina, modelo, valorTamanhoTotal);
            }
        } else {
            System.out.println("Memoria de massa já está cadastrado.");
        }
    }

    public void armazenarStatusmMemoriaDisco(Integer idMaquina) throws IOException {
        for (int i = 0; i < Disco.getQuantidadeDeDiscos(); i++) {
            espacoLivre = maquina.getGrupoDeDiscos().getTamanhoTotal() - Disco.getVolumes().get(i).getDisponivel();
            valorEscrita = Discos.get(i).getEscritas();
            valorLeituras = Discos.get(i).getLeituras();
            valorTempoDeTransferencia = Discos.get(i).getTempoDeTransferencia();
            modelo = Discos.get(i).getModelo();
            String informacoesLogs = String.format("Maquina %d \n"
                    + "Espaço livre da memória do disco: %s\n"
                    + "Valor de escrita: %s \n"
                    + "Valor de leitura: %s \n"
                    + "Valor do tempo de transferência: %s \n"
                    + "Modelo %s \n", idMaquina, espacoLivre, valorEscrita, valorLeituras, valorTempoDeTransferencia, modelo)
                    + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)) + "\n=============================================================================================================\n";
            GravacaoLogs.teste(informacoesLogs);

            MemoriaDiscoModel.armazenarStatus(idMaquina, valorLeituras, valorEscrita, valorTempoDeTransferencia, espacoLivre, modelo);
        }
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
        }
        return dados;
    }
}
