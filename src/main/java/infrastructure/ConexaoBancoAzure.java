package infrastructure;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancoAzure {

    public static final String URL = "jdbc:sqlserver://farmagraphsolutions.database.windows.net;"
            + "databaseName=farmagraphsolutions;"
            + "user=adminProjeto;"
            + "password=2ads$grupo2;"
            + "encrypt=true;"
            + "trustServerCertificate=false;";

    public static final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL);

        } catch (ClassNotFoundException | SQLException erro) {

            throw new RuntimeException("Erro na Conexão com o mssql " + erro.getMessage());
        }
    }
}
