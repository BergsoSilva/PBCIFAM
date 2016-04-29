/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Calendar;

/**
 *
 * @author aluno
 */
public class Pessoa implements Serializable {
    
    private String nome;
    private String endereco;
    private String telefone;
    private Calendar nascimento;
    private Cidade cidade;

    public Pessoa() {
    }
    
    public void setNome (String nome ){
        this.nome=nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    
    public String getEndereco (){
         return  endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Calendar getNascimento() {
        return nascimento;
    }

    public void setNascimento(Calendar nascimento) {
        this.nascimento = nascimento;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }
    
    
}
