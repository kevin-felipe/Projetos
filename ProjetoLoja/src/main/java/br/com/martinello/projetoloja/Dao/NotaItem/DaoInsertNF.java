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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoInsertNF {

    public DaoInsertNF daoNotaItem(MetodoNotaItem metodoNotaItem) throws SQLException {

        try {

            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement stm = connection.prepareStatement("INSERT INTO nota_item"
                    + "(id_nota_item,valor_unitario,id_produto,id_nota_fiscal,quantidade,produto) "
                    + "VALUES (?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans

            stm.setInt(1, metodoNotaItem.getIdNotaItem());
            stm.setDouble(2, metodoNotaItem.getPrecoUnitario());
            stm.setInt(3, metodoNotaItem.getIdProduto());
            stm.setInt(4, metodoNotaItem.getIdNotaFiscal());
            stm.setInt(5, metodoNotaItem.getQuantidade());
            stm.setString(6, metodoNotaItem.getNomeProduto());
            

            stm.execute();
            stm.close();
            JOptionPane.showMessageDialog(null, "Os dados foram gravados ");

            connection.close();
//            ResultSet rst = stm.getGeneratedKeys();
//            while (rst.next()) {
//                Integer id = rst.getInt(1);
//                System.out.println("O id criado foi: " + id);
//            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Os dados não foram Gravados" + e);

        }
        return null;

    }

}
