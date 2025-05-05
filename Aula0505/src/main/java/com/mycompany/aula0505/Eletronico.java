/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0505;

/**
 *
 * @author alunolab02
 */
public class Eletronico extends Produto{
    public int voltagem; 
    
    public Eletronico(int voltagem, String nome, double preco) {
        super(nome, preco);
        this.voltagem = voltagem;
    }
    
@Override //sobrescrita
public void ehCaro(){
        if(preco >200){
            System.out.println("Produto caro.");
        }else{
           System.out.println("Produto barato."); 
        }

}
    
    
    
}
