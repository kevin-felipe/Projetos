/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.NotaItem;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoCliente;
import br.com.martinello.controll.model.MetodoNotaItem;
import br.com.martinello.projetoloja.Dao.Cliente.DaoInsercaoCliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin.carvalho
 */
public class DaoInsert {

    public DaoInsercaoCliente daoNotaItem(MetodoNotaItem metodoNotaItem) throws SQLException {

        try {

            ConnectionFactory factory = new ConnectionFactory();
            Connection connection = factory.recuperaConexao();

            PreparedStatement stm = connection.prepareStatement("INSERT INTO nota_item"
                    + "(id_nota,cpf,celular,localidade,data_de_nacimento,sexo,"
                    + "email,complemento,bairro,cep,logradouro,data_execucao,unidade_federativa) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)",
                    Statement.RETURN_GENERATED_KEYS);//Comando de inserção de produtos no banco pelo NetBeans

            stm.setInt(1, metodoNotaItem.getIdNotaItem());
            stm.setDouble(2, metodoNotaItem.getValorUnitario());
            stm.setInt(3, metodoNotaItem.getIdProduto());
            stm.setInt(4, metodoNotaItem.getIdNotaFiscal());
            stm.setInt(5, metodoNotaItem.getQuantidade());
            stm.setInt(6, metodoNotaItem.getIdSaida());
            stm.setString(7, metodoNotaItem.getProduto());

            stm.execute();
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
