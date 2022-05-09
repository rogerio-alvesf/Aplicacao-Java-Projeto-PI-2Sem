package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoAzure {

    public static final String URl = "jdbc:sqlserver://localhost\\sqlexpress";
    public static final String USER = "sa";
    public static final String PASSS = "";
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URl, USER, PASSS);

        } catch (ClassNotFoundException | SQLException erro) {
            throw new RuntimeException("Erro na conexão com o azure" + erro);
        }
    }

}
