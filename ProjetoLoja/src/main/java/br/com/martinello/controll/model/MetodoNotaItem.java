/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.martinello.controll.model;

/**
 *
 * @author kevin.carvalho
 */
public class MetodoNotaItem {

    private int idNotaItem;
    private int idNotaFiscal;
    private int idProduto;
    private double valorUnitario;
    private int quantidade;
    private String nomeProduto;

    public int getIdProduto() {
        return idProduto;
    }

    public double getPrecoUnitario() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }
    
    

    public int getIdNotaItem() {
        return idNotaItem;
    }

    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setPrecoUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    

    public void setIdNotaItem(int idNotaItem) {
        this.idNotaItem = idNotaItem;
    }

    public void setIdNotaFiscal(int idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

}
