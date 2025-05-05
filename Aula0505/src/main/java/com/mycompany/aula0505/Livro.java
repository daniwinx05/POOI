/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0505;

/**
 *
 * @author alunolab02
 */
public class Livro extends Produto{
    public String autor;
    public int pag;
    
   /*public Livro(String a,int p, String n, double pre){
        autor = a;
        pag = p;
        nome = n;
        preco = pre;
        
    }*/ //atributos herdados da classe pai, foram setados

    public Livro(String autor, int pag, String nome, double preco) {
        super(nome, preco); //forma correta, atributos herdados da classe pai
        this.autor = autor;
        this.pag = pag;
    }

   
    
        
    public void ehGrande(){
        if(pag > 200){
            System.out.println("É grande");
        }else{
            System.out.println("É pequeno");
        }
    
    }
    
    public void ehGrande(boolean ehInfantil){
    
            if(pag > 13){
               System.out.println("Livro infantil grande"); 
            }else{
                System.out.println("Livro infantil pequeno"); 
            }
        
    }
    
}
