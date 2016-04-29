/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author aluno
 */

public class Cidade implements  Serializable{
   
    private String nome;
    
    private Long populacao;
    
   

    public Cidade() {
      
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public void setPopulacao(Long populacao){
        this.populacao=populacao;
    }
    
    public Long getPopulacao() {
        return populacao;
    }
    
        
}
