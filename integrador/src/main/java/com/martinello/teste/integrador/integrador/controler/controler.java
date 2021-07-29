/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martinello.teste.integrador.integrador.controler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kevin.carvalho
 */

@RestController
public class controler {
    
    @GetMapping(path = "/api/status")
    public String check(){
        return "Teste";
    }
    
}
