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

        Integer numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextInt();

        maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);

        while (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false) {
            System.out.println("Númeração da máquina está inválida. Dígite "
                    + "uma numeração de máquina válida:");
            numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextInt();
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

        Boolean respostaLogin = Login.realizarLogin(
                numeracaoMaquinaDigitado,
                senhaMaquinaDigitado);

        if (respostaLogin) {
            System.out.println(String.format("Máquina %s está logada.",
                    maquinaAcessada.getNumeracaoMaquina()));
            ColetarDados(numeracaoMaquinaDigitado);
        }else {
            System.out.println("Computador não exite!!!");
            Logar();
        }
    }

    public static void ColetarDados(Integer idMaquina) {
        ExtrairInformacoes coletarInformacoes = new ExtrairInformacoes(idMaquina);

        coletarInformacoes.armazenarInformacoesComponentes();
        coletarInformacoes.exbirInformacoesComponentes();
        coletarInformacoes.exibirStatusComponentes();
    }
}
