/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.NotaItem;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoNotaItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho //
 */
public class DaoSelectNF {

    public List<MetodoNotaItem> carregarTableItensNF() throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<MetodoNotaItem> buscaItensNota = new ArrayList<>();

        try {

            stmt = connection.prepareStatement("SELECT * FROM nota_item");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MetodoNotaItem metodoNotaItem = new MetodoNotaItem();

                metodoNotaItem.setIdNotaItem(rs.getInt("id_nota_item"));
                metodoNotaItem.setValorUnitario(rs.getDouble("valor_unitario"));
                metodoNotaItem.setIdProduto(rs.getInt("id_produto"));
                metodoNotaItem.setIdNotaFiscal(rs.getInt("id_nota_fiscal"));
                metodoNotaItem.setQuantidade(rs.getInt("quantidade"));
                metodoNotaItem.setNomeProduto(rs.getString("produto"));

                buscaItensNota.add(metodoNotaItem);
            }
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro foi " + ex);
        }

        return buscaItensNota;
    }

    public List<MetodoNotaItem> carregarIdNotaItem() throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<MetodoNotaItem> buscaItensNota = new ArrayList<>();

        try {

            stmt = connection.prepareStatement("SELECT * FROM nota_item WHERE id_nota_fiscal = (SELECT MAX(id_nota_fiscal) FROM nota_item);");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MetodoNotaItem metodoNotaItem = new MetodoNotaItem();

                metodoNotaItem.setIdNotaFiscal(rs.getInt("id_nota_item"));
                metodoNotaItem.setValorUnitario(rs.getDouble("valor_unitario"));
                metodoNotaItem.setIdProduto(rs.getInt("id_produto"));
                metodoNotaItem.setIdNotaItem(rs.getInt("id_nota_fiscal"));
                metodoNotaItem.setQuantidade(rs.getInt("quantidade"));
                metodoNotaItem.setNomeProduto(rs.getString("produto"));

                buscaItensNota.add(metodoNotaItem);
            }
            connection.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro foi " + ex);
        }

        return buscaItensNota;
    }

    public void apagardados() throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        try {
            PreparedStatement stmt = null;

            stmt = connection.prepareStatement("truncate table nota_item");
            stmt.executeUpdate();
        } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "Não foi apagado " + e);
        }

    }
}
