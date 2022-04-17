package models;

import infrastructure.ConexaoBanco;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemoriaDiscoModel {
    public static Boolean verificarInformacoes(Integer IdMaquina) {
        String QUERY = String.format("SELECT ID_MemoriaMassa from MemoriaMassa WHERE FK_Computador = %d", IdMaquina);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(QUERY);) {

            return rs.next();

        } catch (SQLException erro) {
            throw new RuntimeException("Essa máquina não tem Memoria de Massa cadastrada" + erro);
        }
    }

    public static void armazenarInformacoes(Integer IdMaquina,
            String Modelo,
            Long EspacoArmazenamento) {
        String QUERY = String.format("INSERT INTO MemoriaMassa (EspacoArmazenamento,"
                + " FK_Computador, Modelo) VALUES (%d, %d, '%s');",
                EspacoArmazenamento,
                IdMaquina,
                Modelo);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {
                stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Erro ao realizar a inserção dos dados do hardware da memoria de massa" + erro);
        }
    }

    public static void armazenarStatus(
            Integer IdMaquina,
            Long Leitura,
            Long Escrita,
            Long TempoTranferencia,
            Long EspacoLivre,
            String Modelo) {
        String QUERY = String.format("INSERT INTO Log_MemoriaMassa (Leitura, Escrita, "
                + "TempoTranferencia, EspacoLivre, Fk_MemoriaMemoria) values (%d, %d, %d, %d, (SELECT ID_MemoriaMassa from MemoriaMassa WHERE FK_Computador = %d and MemoriaMassa.Modelo = '%s'));",
                Leitura,
                Escrita,
                TempoTranferencia,
                EspacoLivre,
                IdMaquina,
                Modelo);

        try (Connection conn = ConexaoBanco.getConnection();
                Statement stmt = conn.createStatement();) {

            stmt.executeUpdate(QUERY);
        } catch (SQLException erro) {
            throw new RuntimeException("Falha na inserção Dados na Tabela Log Memoria Massa" + erro);
        }
    }
}
