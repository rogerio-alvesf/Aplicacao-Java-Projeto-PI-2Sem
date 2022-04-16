package br.com.sptech.project.sprint.java;

import java.util.Timer;
import java.util.TimerTask;

public class ExtrairInformacoes {
    
    private Processador processador;
    private MemoriaRam memoriaRam;
    private MemoriaDisco memoriaDisco;

    Processador instanciaProcessador = new Processador("", 0.0, 0L);
    MemoriaRam instanciaMemoriaRam = new MemoriaRam(0L, 0L, 0L);
    MemoriaDisco instanciaMemoriaDisco = new MemoriaDisco(0L, "", 0L, 0L, 0L, 0L);

    public ExtrairInformacoes(Integer idMaquina) {
        this.processador = instanciaProcessador;
        this.memoriaRam = instanciaMemoriaRam;
        this.memoriaDisco = instanciaMemoriaDisco;
    }
    
    public void armazenarInformacoesComponentes(Integer idMaquina) {
        processador.armazenarInformacoesCpu();
        memoriaRam.armazenarInformacoesMemoriaRam(idMaquina);
        memoriaDisco.armazenarInformacoesMemoriaDisco();
    }

    public void exbirInformacoesComponentes() {
        System.out.println(processador.exibirInformacoesCpu());
        // System.out.println(memoriaRam.exibirInformacoesMemoriaRam());
        System.out.println(memoriaDisco.exibirInformacoesMemoriaDisco());
    }

    public void exibirStatusComponentes(Integer idMaquina) {
        Integer delay = 1000;   // tempo de espera antes da 1ª execução da tarefa.
        Integer interval = 5000;  // intervalo no qual a tarefa será executada.
        Timer temporizador = new Timer();
        temporizador.scheduleAtFixedRate(
                new TimerTask() {
            public void run() {
                processador.armazenarStatusCpu();
                memoriaRam.armazenarStatusMemoriaRam(idMaquina);

                System.out.println(processador.exibirStatusCpu());
                // System.out.println(memoriaRam.exibirStatusMemoriaRam());
                System.out.println(memoriaDisco.exibirStatusMemoriaDisco());
            }
        }, delay, interval);
    }
;

}
