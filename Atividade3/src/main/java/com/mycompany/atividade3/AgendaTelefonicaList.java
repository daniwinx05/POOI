
package com.mycompany.atividade3;
import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonicaList {
   private List<Contato> contatos = new ArrayList<>();
    
   public AgendaTelefonicaList(){
       this.contatos = new ArrayList();
       
   } 
   

   public void inserir(String nome, String telefone){
        Contato c =  new Contato(nome, telefone);
        contatos.add(c);
    }
    
    public boolean buscarNome(String nome){
      
      return this.contatos.contains(nome);
    }
    
    public void remover(String nome){
        
        this.contatos.remove(nome);
        System.out.println("Contato de "+nome+" remoido com sucesso!");
    }

    public int tamanho(){
        return this.contatos.size();
    }
    
    public void imprimir(){
        if(this.contatos.isEmpty()){
            System.out.println("Agenda vazia.");
        }else{ 
            System.out.println("Total de contatos: " + tamanho());
            
            for(Object Contato: contatos){
            System.out.println(Contato);
            } 
           
        }
            
    }
   
    
}
