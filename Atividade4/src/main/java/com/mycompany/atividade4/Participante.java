
package com.mycompany.atividade4;


public class Participante {
    private String nome;
    private String email;
    
    public Participante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getEmail(){
        return email;
    }
    
    @Override 
    public String toString(){
        return "Nome: " +nome+", Email: "+email;
    }
    
    
    
    
}
