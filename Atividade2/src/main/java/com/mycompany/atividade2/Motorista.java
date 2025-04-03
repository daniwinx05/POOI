
package com.mycompany.atividade2;


public class Motorista {
   private String nome;
   private int cnh;
   public static int qtdMotorista;

   public Motorista(String nome, int cnh){
    this.nome = nome;
    this.cnh = cnh;
    qtdMotorista++;
   }
   
   public static int getMotorista(){
       return qtdMotorista;
   }
   
   @Override
   public String toString(){
       return "\nNome: "+nome+ 
               "\nCNH: "+cnh;
   
   }
   
   
   public String getNome(){
       return nome;
   }
   
   public void setNome(String nome){
       this.nome = nome;
   }
   
   public int getCnh(){
    return cnh;
   }
   
   public void setCnh(int cnh){
       this.cnh = cnh;
   }
}
