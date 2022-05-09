package modelsAzure;

import infrastructure.ConexaoBancoAzure;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {

    public static Boolean realizarLogin(Integer ID, String Senha) {
        String Query = String.format("SELECT ID_Computador, Senha From Computador"
                + "WHERE ID_Computador = %d AND Senha = '%s';", ID, Senha);

        try (Connection conn = ConexaoBancoAzure.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(Query);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Computador nã existe" + erro);
        }
    }
}
