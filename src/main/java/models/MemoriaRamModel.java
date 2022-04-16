package models;

import infrastructure.ConexaoBanco;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MemoriaRamModel {

    public static Boolean verificarInformacoes(Integer IdMaquina) {
        String QUERY = String.format("SELECT ID_MemoriaRam from MemoriaRam WHERE FK_Computador = %d", IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Essa máquina não tem Memoria Ram cadastrada" + erro);
        }
    }

    public static void armazenarInformacoes(Integer IdMaquina,
            Long EspacoArmazenamento) {
        String QUERY = String.format("INSERT INTO MemoriaRam (Total_Armazenamento,"
                + " FK_Computador) VALUES ('%s', %d);",
                EspacoArmazenamento,
                IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {
                stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao realizar a inserção dos dados do hardware da memoria ram" + erro);
        }
    }

    public static void armazenarStatus(Integer IdMaquina,
            Long QTD_MemoriaUso,
            Long QTD_MemoriaDisponivel) {
        String QUERY = String.format("INSERT INTO Log_MemoriaRam (QTD_MemoriaUso,"
                + " MemoriaDisponivel, FK_MemoriaRam) values (%d, %d,"
                + "(SELECT ID_MemoriaRam from MemoriaRam WHERE FK_Computador = %d));",
                QTD_MemoriaUso,
                QTD_MemoriaDisponivel,
                IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {

            stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Falha na inserção Dados na Tabela Log Memoria Ram" + erro);
        }
    }
}
