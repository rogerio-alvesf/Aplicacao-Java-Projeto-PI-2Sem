package br.com.sptech.project.sprint.java;

import java.util.ArrayList;
import com.github.britooo.looca.api.core.Looca;
import com.github.britooo.looca.api.group.discos.Disco;
import java.util.List;
import com.github.britooo.looca.api.group.discos.DiscosGroup;

public class MemoriaDisco {

    private String numeracaoDisco;
    private String valorTamanhoTotal;
    private String modelo;
    private String valorEscrita;
    private String valorLeituras;
    private String valorTempoDeTransferencia;

    Looca maquina = new Looca();

    DiscosGroup Disco = new DiscosGroup();

    List<Disco> Discos = Disco.getDiscos();

    public MemoriaDisco(String valorTamanhoTotal,
            String modelo,
            String valorEscrita,
            String valorLeituras,
            String valorTempoDeTransferencia) {
        this.valorTamanhoTotal = valorTamanhoTotal;
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

    public void armazenarStatusmMemoriaDisco() {
        setValorTamanhoTotal(maquina.getGrupoDeDiscos().getTamanhoTotal().toString());
    }

    public String exibirInformacoesMemoriaDisco() {
        return getModelo();
    }

    public List<String> exibirStatusMemoriaDisco() {
       List<String> dados = new ArrayList();
        String resposta = "";
        for (int i = 0; i < Disco.getQuantidadeDeDiscos(); i++) {
            dados.add(String.format("Dados sobre a memória de disco: %d",
                    i+1));
            dados.add(String.format("Valor de escrita: %s",
                    Discos.get(i).getEscritas().toString()));
            dados.add(String.format("Valor de leitura: %s",
                    Discos.get(i).getLeituras().toString()));
            dados.add(String.format("Valor Tempo de transferencia: %s",
                    Discos.get(i).getTempoDeTransferencia().toString()));
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

/*for(int x = 0; x < maquina.getGrupoDeDiscos().getQuantidadeDeDiscos(); x++){
            valoresStatusMemoriaDisco.add(Discos.get(x)).getModelo(),
            Discos.get(x).getEscritas().toString(),
            Discos.get(0).getLeituras().toString(),
            Discos.get(0).getTempoDeTransferencia().toString());
            setModelo(Discos.get(0).getModelo());
            setValorEscrita(Discos.get(0).getEscritas().toString());
            setValorLeituras(Discos.get(0).getLeituras().toString());
            setValorTempoDeTransferencia(Discos.get(0).getTempoDeTransferencia().toString());
        };*/
