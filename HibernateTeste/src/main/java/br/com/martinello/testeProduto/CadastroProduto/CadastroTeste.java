/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.testeProduto.CadastroProduto;

import br.com.martinello.Produto;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author kevin.carvalho
 */
public class CadastroTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setDescricao("Agua");
        
     EntityManagerFactory FACTORY = Persistence
           .createEntityManagerFactory("Produto");
   
  EntityManager em = FACTORY.createEntityManager();

       
       em.getTransaction().begin();
       em.persist(produto);
       em.getTransaction().commit();
       
       em.close();
        
        
    }
    
    
}
