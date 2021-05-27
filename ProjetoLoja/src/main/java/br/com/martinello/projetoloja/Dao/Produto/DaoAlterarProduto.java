/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.Produto;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoBuscaProduto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoAlterarProduto {

    public MetodoBuscaProduto daoUpdateProduto(MetodoBuscaProduto metodoBuscaProduto) throws SQLException {

        try {
            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement insertNome = connection.prepareStatement("UPDATE  produto SET"
                    + "nome ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertNome.setString(1, metodoBuscaProduto.getNome());
            insertNome.execute();
            connection.close();

            PreparedStatement insertDataFab = connection.prepareStatement("UPDATE  produto SET"
                    + "data_fabricacao ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertDataFab.setString(1, metodoBuscaProduto.getDataFabricacao());
            insertDataFab.execute();
            connection.close();

            PreparedStatement insertDescricao = connection.prepareStatement("UPDATE  produto SET"
                    + "descricao ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertDescricao.setString(1, metodoBuscaProduto.getDescricao());
            insertDescricao.execute();
            connection.close();

            PreparedStatement insertValor = connection.prepareStatement("UPDATE  produto SET"
                    + "valor ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertValor.setDouble(1, metodoBuscaProduto.getValor());
            insertValor.execute();
            connection.close();

            PreparedStatement insertQuantidade = connection.prepareStatement("UPDATE  produto SET"
                    + "quantidade ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertQuantidade.setInt(1, metodoBuscaProduto.getQuantidade());
            insertQuantidade.execute();
            connection.close();

            PreparedStatement insertCategoria = connection.prepareStatement("UPDATE  produto SET"
                    + "categoria ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertCategoria.setString(1, metodoBuscaProduto.getCategoria());
            insertCategoria.execute();
            connection.close();
            
            PreparedStatement insertData = connection.prepareStatement("UPDATE  produto SET"
                    + "ultima_alteracao ? WHERE id_produto = " + metodoBuscaProduto.getId() + ")",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans
            insertData.setString(1, metodoBuscaProduto.getUltimaAlteracao());
            insertData.execute();
            connection.close();
            
            
            JOptionPane.showMessageDialog(null, "Os Dados do Produto foram ATUALIZADOS");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram ATUALIZADOS" + e);
        }
        return metodoBuscaProduto;

    }

}
