package br.com.sptech.project.sprint.java;

public class Maquina {
    private String numeracaoMaquina;
    private String senhaAcessoMaquina;

    public Maquina() {
        this.numeracaoMaquina = "";
        this.senhaAcessoMaquina = "";
    }
    
    public Boolean validarNumeracao(String numeracaoMaquinaDigitada){
        if (numeracaoMaquinaDigitada.trim().equals("")) {
            return false;
        }else {
            return true;
        }
    }
    
        public Boolean validarSenha(String senhaMaquinaDigitada){
        if (senhaMaquinaDigitada.trim().equals("")) {
            return false;
        }else {
            return true;
        }
    }

    public String getNumeracaoMaquina() {
        return numeracaoMaquina;
    }

    public void setNumeracaoMaquina(String numeracaoMaquina) {
        if (validarNumeracao(numeracaoMaquina) == true) {
            this.numeracaoMaquina = numeracaoMaquina;
        }
    }

    public String getSenhaAcessoMaquina() {
        return senhaAcessoMaquina;
    }

    public void setSenhaAcessoMaquina(String senhaAcessoMaquina) {
        if (validarSenha(senhaAcessoMaquina) == true) {
            this.senhaAcessoMaquina = senhaAcessoMaquina;
        }
    }

    @Override
    public String toString() {
        return String.format("Informações de acesso\n"
                + "Numeração da máquina: %s\n"
                + "Senha máquina: %s",
                this.numeracaoMaquina,
                this.senhaAcessoMaquina);
    }
    
}