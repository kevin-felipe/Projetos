/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.Cliente;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoBuscaProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoAlterarCadastroProdutoSelect {

    public List<MetodoBuscaProduto> readProduto() throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();

        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<MetodoBuscaProduto> buscaProduto = new ArrayList<>();

        try {

            stmt = connection.prepareStatement("SELECT * FROM produto");
            rs = stmt.executeQuery();

            while (rs.next()) {
                MetodoBuscaProduto metodoBuscaProduto = new MetodoBuscaProduto();
                metodoBuscaProduto.setId(rs.getInt("id_produto"));
                metodoBuscaProduto.setNome(rs.getString("nome"));
                metodoBuscaProduto.setDataFabricacao(rs.getString("data_fabricacao"));
                metodoBuscaProduto.setDescricao(rs.getString("descricao"));
                metodoBuscaProduto.setValor(rs.getDouble("valor"));
                metodoBuscaProduto.setQuantidade(rs.getInt("quantidade"));
                metodoBuscaProduto.setCategoria(rs.getString("categoria"));
                metodoBuscaProduto.setDataExecucao(rs.getString("data_execucao"));
                buscaProduto.add(metodoBuscaProduto);
            }
            connection.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro foi " + ex);
        }
        return buscaProduto;
    }

}
