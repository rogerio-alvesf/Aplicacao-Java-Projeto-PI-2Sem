package br.com.sptech.project.sprint.java;

public class Maquina {
    private Integer numeracaoMaquina;
    private String senhaAcessoMaquina;

    public Maquina() {
        this.numeracaoMaquina = 0;
        this.senhaAcessoMaquina = "";
    }
    
    public Boolean validarNumeracao(Integer numeracaoMaquinaDigitada){
        if (numeracaoMaquinaDigitada.equals("")) {
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

    public Integer getNumeracaoMaquina() {
        return numeracaoMaquina;
    }

    public void setNumeracaoMaquina(Integer numeracaoMaquina) {
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