package br.com.sptech.project.sprint.java;

import java.util.Scanner;
import models.Login;

public class App {

    public static void main(String[] args) {
        Logar();

    }

    public static void Logar() {
        Scanner leitorNumeracaoMaquina = new Scanner(System.in);
        Scanner leitorSenhaMaquina = new Scanner(System.in);
        Maquina maquinaAcessada = new Maquina();

        System.out.println("*".repeat(15) + "Logar máquina para gerar coletar i"
                + "nformações" + "*".repeat(15) + "\nQual a numeração da máquin"
                + "a:");

        String numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextLine();

        maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);

        while (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false) {
            System.out.println("Númeração da máquina está inválida. Dígite "
                    + "uma numeração de máquina válida:");
            numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextLine();
            maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);
        }

        System.out.println("Qual a senha de acesso da máquina:");
        String senhaMaquinaDigitado = leitorSenhaMaquina.nextLine();

        maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);

        while (maquinaAcessada.validarSenha(senhaMaquinaDigitado) == false) {
            System.out.println("Senha da máquina está inválida. Dígite uma "
                    + "senha de máquina válida:");
            senhaMaquinaDigitado = leitorSenhaMaquina.nextLine();
            maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);
        }
        
        Boolean respostaLogin = Login.realizarLogin("Alber to", "1234");
        
        if(respostaLogin){
            
        System.out.println(String.format("Máquina %s está logada.",
                    maquinaAcessada.getNumeracaoMaquina()));
        }else {
            System.out.println("Tente Novamente!!!");
        }
       
    }

    public static void ColetarDados() {
        ExtrairInformacoes coletarInformacoes = new ExtrairInformacoes();

        coletarInformacoes.armazenarInformacoesComponentes();
        coletarInformacoes.exbirInformacoesComponentes();
        coletarInformacoes.exibirStatusComponentes();
    }
}
