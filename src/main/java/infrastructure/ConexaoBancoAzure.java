package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoAzure {

    public static final String URL =  "jdbc:sqlserver://localhost:1433;databaseName=farmagraphsolutions;user=root;password=@Planeta2011;trustServerCertificate=true";

    public static final String USER = "root";
    public static final String PASS = "@Planeta2011";
    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection getConnection() {
        try {
          //  Class.forName(DRIVER);
            return DriverManager.getConnection(URL);

        } catch ( SQLException erro) {

            throw new RuntimeException("Erro na Conexão com o mssql " + erro.getMessage());
        }
    }
}
