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
    private double valorUnitario;
    private int idProduto;
    private int idNotaFiscal;
    private int quantidade;
    private int idSaida;
    private String produto;

    public int getIdNotaItem() {
        return idNotaItem;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdNotaFiscal() {
        return idNotaFiscal;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public int getIdSaida() {
        return idSaida;
    }

    public String getProduto() {
        return produto;
    }

    public void setIdNotaItem(int idNotaItem) {
        this.idNotaItem = idNotaItem;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public void setIdNotaFiscal(int idNotaFiscal) {
        this.idNotaFiscal = idNotaFiscal;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setIdSaida(int idSaida) {
        this.idSaida = idSaida;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    
}
