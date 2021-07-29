/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martinello.teste.integrador.integrador.controler.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author kevin.carvalho
 */
@Entity
@Table(name = "USUARIOS")
public class Usuario implements Serializable {
    @Id
    @javax.persistence.Id
    @Column(name = "id")
    public Integer id;

    @Column(name = "nome")
    public String nome;

    @Column(name = "login")
    public String login;

    @Column(name = "senha")
    public String senha;

    public Integer getCodigo() {
        return id;
    }

    public void setCodigo(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
