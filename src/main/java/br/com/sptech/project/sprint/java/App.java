package br.com.sptech.project.sprint.java;

import com.github.britooo.looca.api.core.Looca;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class App {

    public static void main(String[] args) {
        Maquina maquinaAcessada = new Maquina();
        Scanner leitorNumeracaoMaquina = new Scanner(System.in);
        Scanner leitorSenhaMaquina = new Scanner(System.in);

        Looca minhaMaquina = new Looca();

        System.out.println("*".repeat(15) + "Logar máquina para gerar coletar i"
                + "nformações" + "*".repeat(15) + "\nQual a numeração da máquin"
                + "a:");

        String numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextLine();

        System.out.println("Qual a senha de acesso da máquina:");
        String senhaMaquinaDigitado = leitorSenhaMaquina.nextLine();

        maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);

        maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);

        while (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false
                || maquinaAcessada.validarSenha(senhaMaquinaDigitado) == false) {
            if (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false
                    && maquinaAcessada.validarSenha(senhaMaquinaDigitado) == false) {
                System.out.println("Numeração da máquina e senha estão inválidas"
                        + ". Qual a numeração da máquina:");
                numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextLine();
                maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);
                System.out.println("Qual a senha de acesso da máquina:");
                senhaMaquinaDigitado = leitorSenhaMaquina.nextLine();
                maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);
            } else if (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false) {
                System.out.println("Númeração da máquina está inválida. Dígite "
                        + "uma numeração de máquina válida:");
                numeracaoMaquinaDigitado = leitorNumeracaoMaquina.nextLine();
                maquinaAcessada.setNumeracaoMaquina(numeracaoMaquinaDigitado);
            } else if (maquinaAcessada.validarSenha(senhaMaquinaDigitado) == false) {
                System.out.println("Senha da máquina está inválida. Dígite uma "
                        + "senha de máquina válida:");
                senhaMaquinaDigitado = leitorSenhaMaquina.nextLine();
                maquinaAcessada.setSenhaAcessoMaquina(senhaMaquinaDigitado);
            }
        }
        System.out.println(String.format("Máquina %s está logada.",
                maquinaAcessada.getNumeracaoMaquina()));
    }
}
