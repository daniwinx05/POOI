/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefolricultura;

/**
 *
 * @author Danielle
 */
public class Arranjo extends Flor{
    
    public String nomeArranjo;
    
    public Arranjo(String arranjo,String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
        this.nomeArranjo = arranjo;
    }
    
    
    @Override
    public void exibirInfo(){
        System.out.println("Arranjo: " +nomeArranjo+", tipo de flor: " + nome+", preco: "+preco);
    }

    @Override
    public double calcularPrecoTotal() {
        return preco*quantidade;
        
    }
    
    

   
}
