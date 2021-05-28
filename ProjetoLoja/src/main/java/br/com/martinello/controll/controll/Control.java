/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.controll;


import br.com.martinello.controll.model.MetodoCliente;
import br.com.martinello.controll.model.MetodoNotaItem;
import br.com.martinello.controll.model.MetodoProduto;
import br.com.martinello.projetoloja.Dao.Cliente.DaoClienteInsert;
import br.com.martinello.projetoloja.Dao.NotaItem.DaoInsertNF;
import br.com.martinello.projetoloja.Dao.Produto.DaoUpdateProduto;
import br.com.martinello.projetoloja.Dao.Produto.DaoInsertProduto;
import br.com.martinello.projetoloja.Dao.Produto.DaoSelectProduto;
import java.sql.SQLException;

/**
 *
 * @author kevin.carvalho
 */
public class Control {

    DaoInsertProduto daoInsertProduto = new DaoInsertProduto();
    DaoSelectProduto daoSelectProduto = new DaoSelectProduto();
    DaoUpdateProduto daoUpdateProduto = new DaoUpdateProduto();
    DaoClienteInsert daoClienteInsert = new DaoClienteInsert();
    DaoInsertNF daoInsertNF  = new DaoInsertNF();

    MetodoProduto metodoProduto = new MetodoProduto();
    MetodoNotaItem metodoNotaItem = new MetodoNotaItem();


    //Cliente
    //-----------------------------------------------------------------------------------------------
//     public void SalvarCliente(MetodoCliente metodoCliente) throws SQLException {//SalvarCadastroCliete
//        this.daoClienteSelect.CarregarTabelaIniciar(metodoCliente);
//    }
    public void InsertCadastroCliente(MetodoCliente metodoCliente) throws SQLException {
        this.daoClienteInsert.insertTelaCadastroCliente(metodoCliente);
    }

    //Produto
    //-----------------------------------------------------------------------------------------------

    public void InsertCadastroProduto(MetodoProduto metodoProduto) throws SQLException {
        this.daoInsertProduto.daoInsertProduto(metodoProduto);

    }

    public void UpdateProduto(MetodoProduto metodoProduto) throws SQLException {
        this.daoUpdateProduto.daoUpdateProduto(metodoProduto);

    }

    //NotaFiscal
    //-----------------------------------------------------------------------------------------------
//    public void InsertProduto(MetodoProduto metodoAlterarProduto) throws SQLException {//UPdateProduto
//        this.daoAlterarProduto.daoUpdateProduto(metodoBuscaProduto);
//    }
    
     //NotaItem
    //-----------------------------------------------------------------------------------------------
    public void selectNotaIe(MetodoProduto metodoProduto) throws SQLException {
           this.daoUpdateProduto.daoUpdateProduto(metodoProduto);
    }
     
        
       public void insertNotaItem(MetodoNotaItem metodoNotaItem) throws SQLException{
        this.daoInsertNF.daoNotaItem(metodoNotaItem); 
        

    }
}
