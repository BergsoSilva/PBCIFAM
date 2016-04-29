/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import modelo.Empresa;
import modelo.Receita;

/**
 *
 * @author aluno
 */
public class EmpresaDeclaraReceita {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        Receita receitaFederal = new Receita();
        
        // empresa ouvinte 
        empresa.setOuvinte(receitaFederal);

        empresa.pagarFuncionario();
        
                             
    }
}
