/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefolricultura;

/**
 *
 * @author Danielle
 */
public abstract class Flor implements ItensFlor {
    protected String nome;
    protected double preco;
    protected int quantidade;
    
    public Flor(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    
    public abstract void exibirInfo();
    
   
    
}
