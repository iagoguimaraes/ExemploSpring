/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senac.tads4b.exemplospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExemploController {
    
    @RequestMapping("/xpto")
    public String executar(){
        return "exemplo";
    }
    
    @RequestMapping("/xpto2")
    public String executar2(
            @RequestParam("nome")String nome, 
            @RequestParam("idade")int idade,
            Model modelo){
        modelo.addAttribute("nomeAttr", nome);
        modelo.addAttribute("idadeAttr", idade);
        return "exemplo2";
    }
    
}
