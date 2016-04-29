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
public class Receita implements SalarioRecebidoListener{

    @Override
    public void salarioRecebio(SalarioRecebidoEvent event) {
        System.out.println("Salario recebido na receita.");
        System.out.println(event.getSalario());
    }
    
}
