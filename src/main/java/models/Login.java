package models;

import infrastructure.ConexaoBanco;
import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class Login {

    ConexaoBanco conexao = new ConexaoBanco();
    //PARA CRIAR, DELETAR E ATUALIZAR DATABASE, USAR .EXECUTE

    public void realizarLogin(){
        List<Login> listaComputadores = conexao.getConexao().query("SELECT * FROM Computador", new BeanPropertyRowMapper<T>(Login.class));
        System.out.println(listaComputadores);
    }
}
