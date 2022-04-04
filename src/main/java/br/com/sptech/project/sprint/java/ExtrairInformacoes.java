package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;
import java.util.Timer;
import java.util.TimerTask;

public class ExtrairInformacoes {

    Looca maquina = new Looca();

    private Processador processador;
    private MemoriaRam memoriaRam;

    public ExtrairInformacoes() {
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public MemoriaRam getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(MemoriaRam memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void coletarInformacoesComponentes() {
        System.out.println(processador.getNome());
        System.out.println(memoriaRam.getTotal());
    }

    public void constultarStatusComponentes() {
        Integer delay = 1000;   // tempo de espera antes da 1ª execução da tarefa.
        Integer interval = 3000;  // intervalo no qual a tarefa será executada.
        Timer temporizador = new Timer();
        temporizador.scheduleAtFixedRate(
                new TimerTask() {
            public void run() {
                System.out.println(processador.getFrequencia());
                System.out.println(processador.getUso());
                System.out.println(memoriaRam.getDisponivel());
                System.out.println(memoriaRam.getUso());
            }
        }, delay, interval);
    }
;

}
