package br.com.sptech.project.sprint.java;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ExtrairInformacoes coletarInformacoes = new ExtrairInformacoes();
        Maquina maquinaAcessada = new Maquina();
        Scanner leitorNumeracaoMaquina = new Scanner(System.in);
        Scanner leitorSenhaMaquina = new Scanner(System.in);

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

        System.out.println(String.format("Máquina %s está logada.",
                maquinaAcessada.getNumeracaoMaquina()));
        
        coletarInformacoes.coletarInformacoesComponentes();
        coletarInformacoes.constultarStatusComponentes();
}
}

/*if (maquinaAcessada.validarNumeracao(numeracaoMaquinaDigitado) == false
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
 */
