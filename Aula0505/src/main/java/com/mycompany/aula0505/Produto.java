/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0505;

/**
 *
 * @author alunolab02
 */
public class Produto {
    public String nome;
    public double preco;
    
   /* public Produto(){}*/ //utilizando o construtor vazio, será necessário setr ele na classe que irá herdar os seus atributos  
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;  
    }
    
    public void ehCaro(){
        
        if(preco > 100){
            System.out.println("Produto caro.");
        }else{
           System.out.println("Produto barato."); 
        }
    }
    
}
