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
public class MetodoBuscaProduto {

    private int id;
    private String nome;
    private String dataFabricacao;
    private String descricao;
    private double valor;
    private int quantidade;
    private String categoria;
    private String dataExecucao;


    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDataExecucao() {
        return dataExecucao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDataExecucao(String dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

}
