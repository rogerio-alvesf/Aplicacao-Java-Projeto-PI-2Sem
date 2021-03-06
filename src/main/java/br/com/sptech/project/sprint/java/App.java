package br.com.sptech.project.sprint.java;

import infrastructure.GravacaoLogs;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;
import modelsAzure.Login;

public class App {

    GravacaoLogs logs = new GravacaoLogs();

    public static void main(String[] args) throws IOException {
        Logar();
    }

    public static void Logar() throws IOException {
        Scanner leitorNumeracaoMaquina = new Scanner(System.in);
        Scanner leitorSenhaMaquina = new Scanner(System.in);
        Maquina maquinaAcessada = new Maquina();

        System.out.println("*".repeat(15) + "Logar máquina para coletar i"
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
            System.out.println(String.format("Máquina %s está logado.",
                    maquinaAcessada.getNumeracaoMaquina()));
            ColetarDados(numeracaoMaquinaDigitado);
            
            String informacaoLog = String.format("Maquina %s logada com sucesso \n", maquinaAcessada.getNumeracaoMaquina())
                    + LocalDateTime.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)) + "\n....................................................................................................";
            GravacaoLogs.teste(informacaoLog);
        } else {
            System.out.println("Computador não está cadastrado!!!");
            Logar();
        }
    }

    public static void ColetarDados(Integer idMaquina) {
        ExtrairInformacoes coletarInformacoes = new ExtrairInformacoes(idMaquina);
        coletarInformacoes.armazenarInformacoesComponentes(idMaquina);
        coletarInformacoes.exbirInformacoesComponentes();
        coletarInformacoes.exibirStatusComponentes(idMaquina);
    }
}
