/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.controll;

import br.com.martinello.controll.model.MetodoAlterarProduto;
import br.com.martinello.controll.model.MetodoBuscaCliente;
import br.com.martinello.controll.model.MetodoBuscaProduto;
import br.com.martinello.controll.model.MetodoCliente;
import br.com.martinello.controll.model.MetodoProduto;
import br.com.martinello.projetoloja.Dao.Cliente.DaoBuscaCliente;
import br.com.martinello.projetoloja.Dao.Cliente.DaoInsercaoCliente;
import br.com.martinello.projetoloja.Dao.Produto.DaoAlterarProduto;
import br.com.martinello.projetoloja.Dao.Produto.DaoInsercaoProduto;
import java.sql.SQLException;

/**
 *
 * @author kevin.carvalho
 */
public class Controll {
    
    MetodoAlterarProduto metodoAlterarProduto= new MetodoAlterarProduto();
    DaoInsercaoProduto daoInsercaoProduto = new DaoInsercaoProduto();
    DaoInsercaoCliente daoInsercaoCliente = new DaoInsercaoCliente();
    DaoBuscaCliente daoBuscaCliente = new DaoBuscaCliente();
    DaoAlterarProduto daoAlterarProduto = new DaoAlterarProduto();
    MetodoProduto metodoProduto = new MetodoProduto();
    MetodoBuscaProduto metodoBuscaProduto=new MetodoBuscaProduto();
    MetodoCliente metodoCliente = new MetodoCliente();
    MetodoBuscaCliente metodoBuscaCliente = new MetodoBuscaCliente();

    public void SalvarProduto(MetodoProduto metodoProduto) throws SQLException {//SalvarCadastroProduto
        this.daoInsercaoProduto.daoProduto(metodoProduto);
    }

    public void SalvarCliente(MetodoCliente metodoCliente) throws SQLException {//SalvarCadastroCliete
        this.daoInsercaoCliente.daoCliente(metodoCliente);
    }
    
    public void InsertProduto(MetodoAlterarProduto metodoAlterarProduto)throws SQLException{//UPdateProduto
       this.daoAlterarProduto.daoUpdateProduto(metodoBuscaProduto);
}
    

}
