/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1b;

/**
 *
 * @author Danielle
 */
public class Contato {
    private String tipo;
    private String contato;
    
    
    public Contato(String tipo, String contato){
        this.contato = contato;
        this.tipo = tipo;
    }
    
    
    public String getTipo(){   
        return tipo;
    }
    
    public String getContato(){
        return contato;
    }

    @Override
    public String toString(){
        return "\nTipo: " +tipo+ ", Contato: "+contato;
    }
}
