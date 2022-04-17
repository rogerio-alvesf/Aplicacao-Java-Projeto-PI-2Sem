package models;

import infrastructure.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProcessadorModel {
    public static Boolean verificarInformacoes(Integer IdMaquina) {
        String QUERY = String.format("SELECT ID_Processador from Processador WH"
                + "ERE FK_Computador = %d", IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Essa máquina não tem um Processador cad"
                    + "astrado" + erro);
        }
    }

    public static void armazenarInformacoes(Integer IdMaquina,
            String Modelo) {
        String QUERY = String.format("INSERT INTO Processador (Modelo,"
                + " FK_Computador) VALUES ('%s', %d);",
                Modelo,
                IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {
                stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao realizar a inserção dos dados d"
                    + "o hardware do Processador" + erro);
        }
    }

    public static void armazenarStatus(
            Integer IdMaquina,
            Long Frequencia,
            Double Uso) {
        String QUERY = String.format("INSERT INTO Log_Processador ("
                + "Frequencia,"
                + " Uso,"
                + " FK_Processador)"
                + " VALUES (%d, %.0f, (SELECT ID_Processador FROM Processador"
                + " WHERE FK_Computador = %d));",
                Frequencia,
                Uso,
                IdMaquina);
     
        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {

            stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Falha na inserção Dados na Tabela Log P"
                    + "rocessador\n" + erro);
        }
    }
}
