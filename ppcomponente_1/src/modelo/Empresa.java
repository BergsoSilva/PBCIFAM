/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import teste.*;
import events.SalarioRecebidoEvent;
import interfaces.SalarioRecebidoListener;

/**
 *
 * @author aluno
 */
public class Empresa {
    
    SalarioRecebidoListener ouvinte=null;
    
    Double salario = 1000.00;

    public void setOuvinte(SalarioRecebidoListener ouvinte) {
        this.ouvinte = ouvinte;
    }

    public void notifySalarioRecebido ( double salario){
        
        SalarioRecebidoEvent evento = new SalarioRecebidoEvent(this, salario);
        
        ouvinte.salarioRecebio(evento);
        
    }
    
    public void pagarFuncionario () {
        notifySalarioRecebido(salario);
        
    }
    
    
    
    
}
