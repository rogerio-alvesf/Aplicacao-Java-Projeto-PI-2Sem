package models;

import infrastructure.ConexaoBanco;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    public static Boolean realizarLogin(String Nome, String Senha) {
        String QUERY = String.format("SELECT Nome, Senha From Responsavel "
                + "WHERE Nome ='%s' AND Senha = '%s'", Nome, Senha);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Computador não existe" + erro);
        }
    }
}
