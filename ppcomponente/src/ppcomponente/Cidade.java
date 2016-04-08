/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ppcomponente;

import java.io.Serializable;

/**
 *
 * @author aluno
 */

public class Cidade implements  Serializable{
   
    private String nome;
    
   

    public Cidade() {
      
    }
    
    

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    
        
}
