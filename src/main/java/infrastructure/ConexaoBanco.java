package infrastructure;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConexaoBanco {

    private JdbcTemplate conexao;

    public ConexaoBanco() {
        BasicDataSource dataSource = new BasicDataSource();

        dataSource​.setDriverClassName("com.mysql.jdbc.Driver");//driver do banco
        dataSource​.setUrl("jdbc:mysql://localhost:3306/nome_banco");// url para se conectar com o banco e dizer se vai ser do tipo de arquivo ou de memória
        dataSource​.setUsername("root");//System Administration nome padrão do user name do h2
        dataSource​.setPassword("");//senha de acesso ao banco de dados

        conexao = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getConexao() {
        return conexao;
    }
}
