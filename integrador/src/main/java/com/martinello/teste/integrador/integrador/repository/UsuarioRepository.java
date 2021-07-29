/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martinello.teste.integrador.integrador.repository;

import com.martinello.teste.integrador.integrador.controler.model.Usuario;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author kevin.carvalho
 */
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    
}
