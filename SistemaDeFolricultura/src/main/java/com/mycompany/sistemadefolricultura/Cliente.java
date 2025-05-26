/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefolricultura;

/**
 *
 * @author Danielle
 */
public class Cliente {
    public String nome;
    public String telefone;
    
    public Cliente(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    
    }
    

    public void dadosCliente(){
        System.out.println("\nNome: " + nome+ ", telefone: " +telefone);
    }



}
