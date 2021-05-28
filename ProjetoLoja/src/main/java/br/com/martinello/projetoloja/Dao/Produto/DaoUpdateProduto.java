/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.Produto;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoBuscaProduto;
import br.com.martinello.controll.model.MetodoProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoUpdateProduto {

    public MetodoBuscaProduto daoUpdateProduto(MetodoProduto metodoProduto) throws SQLException {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement insertNome = connection.prepareStatement("UPDATE  produto SET"
                    + " nome = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertNome.setString(1, metodoProduto.getNome());
            insertNome.setInt(2, metodoProduto.getId());

            insertNome.execute();
            insertNome.close();

            PreparedStatement insertDataFab = connection.prepareStatement("UPDATE  produto SET"
                    + " data_fabricacao =  ? WHERE id_produto = ?",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertDataFab.setString(1, metodoProduto.getDataFabricacao());
            insertDataFab.setInt(2, metodoProduto.getId());

            insertDataFab.execute();
            insertDataFab.close();

            PreparedStatement insertDescricao = connection.prepareStatement("UPDATE  produto SET"
                    + " descricao = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertDescricao.setString(1, metodoProduto.getDescricao());
            insertDescricao.setInt(2, metodoProduto.getId());

            insertDescricao.execute();
            insertDescricao.close();

            PreparedStatement insertValor = connection.prepareStatement("UPDATE  produto SET"
                    + " valor = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertValor.setDouble(1, metodoProduto.getValor());
            insertValor.setInt(2, metodoProduto.getId());

            insertValor.execute();
            insertValor.close();

            PreparedStatement insertQuantidade = connection.prepareStatement("UPDATE  produto SET"
                    + " quantidade = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertQuantidade.setInt(1, metodoProduto.getQuantidade());
            insertQuantidade.setInt(2, metodoProduto.getId());

            insertQuantidade.execute();
            insertQuantidade.close();

            PreparedStatement insertCategoria = connection.prepareStatement("UPDATE  produto SET"
                    + " categoria = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertCategoria.setString(1, metodoProduto.getCategoria());
            insertCategoria.setInt(2, metodoProduto.getId());

            insertCategoria.execute();
            insertCategoria.close();

            PreparedStatement insertData = connection.prepareStatement("UPDATE  produto SET"
                    + " ultima_alteracao = ? WHERE id_produto = ?;",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertData.setString(1, metodoProduto.getUltimaAlteracao());
            insertData.setInt(2, metodoProduto.getId());
            
            
            insertData.execute();
            insertData.close();
            

            JOptionPane.showMessageDialog(null, "Os Dados do Produto foram ATUALIZADOS");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram ATUALIZADOS" + e);
        }
        return null;

    }

}
