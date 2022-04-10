package br.com.sptech.project.sprint.java;

import java.util.Timer;
import java.util.TimerTask;

public class ExtrairInformacoes {
    
    private Processador processador;
    private MemoriaRam memoriaRam;
    private MemoriaDisco memoriaDisco;
    
    Processador instanciaProcessador = new Processador("", "", "");
    MemoriaRam instanciaMemoriaRam = new MemoriaRam("", "", "");
    MemoriaDisco instanciaMemoriaDisco = new MemoriaDisco("", "", "", "", "");

    public ExtrairInformacoes() {
        this.processador = instanciaProcessador;
        this.memoriaRam = instanciaMemoriaRam;
        this.memoriaDisco = instanciaMemoriaDisco;
    }

    public MemoriaDisco getMemoriaDisco() {
        return memoriaDisco;
    }

    public void setMemoriaDisco(MemoriaDisco memoriaDisco) {
        this.memoriaDisco = memoriaDisco;
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
    
    public void armazenarInformacoesComponentes(){
        processador.armazenarInformacoesCpu();
        memoriaRam.armazenarInformacoesMemoriaRam();
        memoriaDisco.armazenarInformacoesMemoriaDisco();
    }

    public void exbirInformacoesComponentes() {
        System.out.println(processador.exibirInformacoesCpu());
        System.out.println(memoriaRam.exibirInformacoesMemoriaRam());
        System.out.println(memoriaDisco.exibirInformacoesMemoriaDisco());
    }

    public void exibirStatusComponentes() {
        Integer delay = 1000;   // tempo de espera antes da 1ª execução da tarefa.
        Integer interval = 5000;  // intervalo no qual a tarefa será executada.
        Timer temporizador = new Timer();
        temporizador.scheduleAtFixedRate(
            new TimerTask() {
            public void run() {
                processador.armazenarStatusCpu();
                memoriaRam.armazenarStatusMemoriaRam();
                
                System.out.println(processador.exibirStatusCpu());
                System.out.println(memoriaRam.exibirStatusMemoriaRam());
                System.out.println(memoriaDisco.exibirStatusMemoriaDisco());
            }
        }, delay, interval);
    }
;

}
