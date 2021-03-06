/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.projetoloja.Dao.Cliente;

import br.com.martinello.controll.controll.ConnectionFactory;
import br.com.martinello.controll.model.MetodoBuscaCliente;
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
public class DaoBuscaCliente {

    public List<MetodoBuscaCliente> daoBuscaCliente(String nome) throws SQLException {
        ConnectionFactory factory = new ConnectionFactory();
        Connection connection = factory.recuperaConexao();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<MetodoBuscaCliente> buscaClientes = new ArrayList<>();
        
        try {
            
            stmt = connection.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%" + nome + "%");
            rs = stmt.executeQuery();
            
            while (rs.next()) {
                MetodoBuscaCliente metodoBuscaCliente = new MetodoBuscaCliente();
                metodoBuscaCliente.setId(rs.getInt("id_cliente"));
                metodoBuscaCliente.setNome(rs.getString("nome"));
                metodoBuscaCliente.setCpf(rs.getString("cpf"));
                metodoBuscaCliente.setCelular(rs.getString("celular"));
                metodoBuscaCliente.setLocalidade(rs.getString("localidade"));
                metodoBuscaCliente.setDataNascimento(rs.getString("data_de_nacimento"));
                metodoBuscaCliente.setSexo(rs.getString("sexo"));
                metodoBuscaCliente.setEmail(rs.getString("email"));
                metodoBuscaCliente.setComplemento(rs.getString("complemento"));
                metodoBuscaCliente.setBairro(rs.getString("bairro"));
                metodoBuscaCliente.setCep(rs.getString("cep"));
                metodoBuscaCliente.setLogradouro(rs.getString("logradouro"));
                metodoBuscaCliente.setDataExecucao(rs.getString("data_execucao"));
                metodoBuscaCliente.setUf(rs.getString("unidade_federativa"));
                buscaClientes.add(metodoBuscaCliente);
            }
            connection.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro foi " + ex);
        }
        

        return buscaClientes;        
    }
    
}
