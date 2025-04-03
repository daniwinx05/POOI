/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sitemabiblioteca;

/**
 *
 * @author Danielle
 */
public class Bibliotecario {
    private String nome;
    private int numRegistro;
    
    public Bibliotecario(String nome, int numRegistro){
        this.nome = nome;
        this.numRegistro = numRegistro;
    }
    
    public String getNome(){
        return nome;
    }

    public int getNumR(){
        return numRegistro;
    }

    @Override
    public String toString(){
        return "\nNome: "+nome+", Numero de regstro: " +numRegistro;
    }
}
