package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;

public class MemoriaDisco {
    Looca maquina = new Looca();
    
    public void informacoes(){
        System.out.println(maquina.getGrupoDeDiscos());
    }
}
