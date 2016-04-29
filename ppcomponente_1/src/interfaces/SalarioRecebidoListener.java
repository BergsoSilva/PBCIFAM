/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import events.SalarioRecebidoEvent;

/**
 *
 * @author aluno
 */
public interface SalarioRecebidoListener  extends java.util.EventListener {
    
    void salarioRecebio (SalarioRecebidoEvent event);         
    
}
