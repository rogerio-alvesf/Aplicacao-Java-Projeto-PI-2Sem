package models;

import infrastructure.ConexaoBanco;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {

    public static Boolean realizarLogin(Integer ID, String Senha) {
        String QUERY = String.format("SELECT ID_Computador, Senha From Computador"
                + " WHERE ID_Computador = %d AND Senha = '%s';", ID, Senha);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Computador não existe" + erro);
        }
        
       
    }
    
    
    
}
