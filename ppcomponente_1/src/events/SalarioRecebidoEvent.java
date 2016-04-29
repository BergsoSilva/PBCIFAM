/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package events;

import modelo.*;

/**
 *
 * @author aluno
 */
public class SalarioRecebidoEvent extends java.util.EventObject {
    
    private Double salario;

    public SalarioRecebidoEvent(Object source, Double salario) {
        
        // Chama o construtor da super class EventObject
        super(source);
        this.salario=salario;
    }

    public Double getSalario() {
        return salario;
    }
    
    
    
}
