/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielle
 */
public class Autor {
    private String nome;
    private String abreviatura;
    private List<Contato> contatos;
    
    public Autor(String nome, String abreviatura){
        this.nome = nome;
        this.abreviatura = abreviatura;
        this.contatos = new ArrayList<>();   
    }
    
    
    public void adicionarContato(String tipo, String contato){
        Contato novoContato = new Contato(tipo, contato);
        this.contatos.add(novoContato);
    }
    
    public String getNome(){
        return nome;
    }
    
    public String getAbreviatura(){
        return abreviatura;
    }
    
    @Override
    public String toString(){
        return "\nNome: " +nome+ ",  Abreviatura: " +abreviatura+"\nContato:"+contatos;
    }
    
    
}
