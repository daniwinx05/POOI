/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefolricultura;

/**
 *
 * @author Danielle
 */
public class FlorSimples extends Flor{

    public FlorSimples(String nome, double preco, int quantidade){
        super(nome, preco, quantidade);
    }
    
    @Override
    public void exibirInfo() {
        System.out.println("Nome: " +nome+", Preço unitário: " +preco);
    }

    @Override
    public double calcularPrecoTotal() {
        return preco*quantidade;
    }
    
}
