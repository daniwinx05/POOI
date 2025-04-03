
package com.mycompany.atividade4;
import java.util.HashSet;
import java.util.Set;

public class Evento {
    String nome;
    private Set<Participante> participantes;
    
    public Evento(String nome){
        this.nome = nome;
        this.participantes = new HashSet<>();
    }
    
    public void Inserir(String nome, String email){
        
        for(Participante p: participantes){
            if(p.getEmail().equals(email)){
                System.out.println("Email de participante já existente.");
                return;
            }
            System.out.println("Cadastro reatlizado com sucesso!");   
        }
        
        Participante part = new Participante(nome, email);
        this.participantes.add(part);//participantes.add(new Participante(nome, email));
    }
    
    public void remover(String email){
        Participante remover = null;
        for(Participante p: participantes){
            if(p.getEmail().equals(email)){
                remover = p;
                break;
            }
        }
        
        if(remover != null){
            participantes.remove(remover);
            System.out.println("Participante "+remover+" removido com sucesso!");
        }else{
            System.out.println("Participante com o email: "+remover+" não encontrado.");
        }
    }
    
    
    
    public void ListaPart(){
        if(this.participantes.isEmpty()){
            System.out.println("Nenhum participante cadastrado.");
        }else{
            System.out.println("LISTA DE PARTICIPANTES!");
            for(Participante p: participantes){
            System.out.println(p.toString());
            }
        }
    
    }
    
}
