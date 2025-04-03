/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sitemabiblioteca;

/**
 *
 * @author Danielle
 */
public class Autor {
    private String nome;
    private String nacionalidade;
    
    public Autor(String nome, String nacionalidade){
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getNacion(){
        return nacionalidade;
    }
    
    @Override
    public String toString(){
        return "\nNome Autor: "+nome+", Nacionalidade: "+nacionalidade;
    }
}
