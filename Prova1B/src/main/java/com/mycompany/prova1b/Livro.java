/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielle
 */
public class Livro {
    private String nome;
    private int anoPublicado;
    private Editora editor;
    private List<Autor> autores;
    
    public Livro(String nome, int anoPublicado, Autor autora, Editora editor){
        this.nome = nome;
        this.anoPublicado = anoPublicado;
        this.editor = editor;
        this.autores = new ArrayList<>();
        this.autores.add(autora);
    }
    
    public void adicionarAutor(Autor autora){
        this.autores.add(autora);
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getAnoPublicado(){
        return anoPublicado;
    }
    
    public Editora getEditor(){
        return editor;
    }
    
    public void set(Editora editor){
        this.editor = editor;
    }
    
    @Override
    public String toString(){
        return "Nome Livro: "+nome+", Ano Publicado: "+anoPublicado+"\nAutor: "+autores.toString()+"\nEditora"+editor.toString();
    }
    
}
