/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1b;

/**
 *
 * @author Danielle
 */
public class Editora {
    private String nome;
    private String email;
    
    public Editora(String nome, String email){
    
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
    public String toString() {
        return "\nNome:  "+ nome + ", Editora email: " +email;
    }
    
    
}
