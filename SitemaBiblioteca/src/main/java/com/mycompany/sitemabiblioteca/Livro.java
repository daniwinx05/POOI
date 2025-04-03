/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sitemabiblioteca;

/**
 *
 * @author Danielle
 */
public class Livro {
    private String titulo;
    private int anoPublicação;
    private Bibliotecario responsavel;
    private Editora editora;
    private Detalhamento d;
    private Autor autor;
    public static int qtdLivros = 0;
    
    public Livro(String titulo, int anoPublicado, String nomeAut,String nacionalidadeAut, Bibliotecario responsavel, Editora editora, Detalhamento d){
        this.titulo = titulo;
        this.anoPublicação = anoPublicado;
        this.responsavel = responsavel;
        this.editora = editora;
        this.autor = new Autor(nomeAut, nacionalidadeAut);
        this.d = d;
        qtdLivros++;
    }
    
    public void SetRespon(Editora novaEditora, Bibliotecario quemAlterou){
        this.editora = novaEditora;
        this.responsavel = quemAlterou;
    }

    @Override
    public String toString() {
        return "\nTitulo: " + titulo + 
                "\nAno Publicado: " + anoPublicação + 
                "\nAutor: " + autor +
                "\nResponsavel: " + responsavel + 
                "\nEditora: " + editora + 
                "\nDetalhamento: " + d;  
                
    }
    
    
    
}
