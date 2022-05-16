package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {

    public static final String URL = "jdbc:mysql://localhost:3306/farmagraphsolutions";
    public static final String USER = "root";
    public static final String PASS = "Banho009";
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public static Connection getConnection() {
        try {

            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);

        } catch (ClassNotFoundException | SQLException erro) {

            throw new RuntimeException("Erro na Conexão com o Mysql" + erro);
        }
    }
}
