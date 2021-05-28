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
public class MetodoProduto{

    private int idProduto;
    private String nomeProduto;
    private String dataFabricacao;
    private String descricao;
    private double valorUnitario;
    private int quantidade;
    private String categoria;
    private String dataExecucao;
    private String ultimaAlteracao;

    public String getUltimaAlteracao() {
        return ultimaAlteracao;
    }
    
    public int getId() {
        return idProduto;
    }

    public String getDataExecucao() {
        return dataExecucao;
    }

    public String getNome() {
        return nomeProduto;
    }

    public String getDataFabricacao() {

        return dataFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valorUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setUltimaAlteracao(String ultimaAlteracao) {
        this.ultimaAlteracao = ultimaAlteracao;
    }

    
    
    public void setId(int id) {
        this.idProduto = id;
    }

    public void setNome(String nome) {
        this.nomeProduto = nome;
    }

    public void setDataExecucao(String dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valorUnitario = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

}
