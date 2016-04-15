/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import modelo.Cidade;
import modelo.Pessoa;


public class Teste {

    public Teste() throws ParseException {
        
        gravar();
    }
    
    
    
  
    public void gravar () throws ParseException{
        
       Cidade cidade = new Cidade();
       cidade.setNome("Manaus");
       cidade.setPopulacao(Long.parseLong("1000"));
       
       
     
       Pessoa pessoa= new Pessoa();
        pessoa.setNome("Bergson");
        pessoa.setEndereco("Rua A");
        Calendar c = Calendar.getInstance();
        
              
       
        pessoa.setNascimento(c);
        pessoa.setTelefone("123456657");
        pessoa.setCidade(cidade);
        
     //Calendar data="data";
    // Date date= data.getTime();
       SimpleDateFormat sada= new SimpleDateFormat();
       
       // retorna  sada.format(date)
        
        System.out.println("Nome:"+pessoa.getNome()+"\n Cidade: "
                +pessoa.getCidade().getNome() +"\n População: "
                + cidade.getPopulacao() +"\n Nasc :"
                +pessoa.getNascimento().getTime());
        
      
        
    }
   
    public static void main(String[] args) {
        try {
            new Teste();
        } catch (ParseException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
    
