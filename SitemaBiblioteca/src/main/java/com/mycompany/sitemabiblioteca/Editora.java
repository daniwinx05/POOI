
package com.mycompany.sitemabiblioteca;


public class Editora {
    private String nome;
    private String cidade;

    public Editora(String nome, String cidade){
        this.nome = nome;
        this.cidade = cidade;
    }
    
    public String getNomeL(){
        return nome;
    }

    public String getCidade(){
        return cidade;
    }
    
    
@Override
public String toString(){
        return "\n Nome Editora: "+nome+", Cidade: "+cidade;

}


}
