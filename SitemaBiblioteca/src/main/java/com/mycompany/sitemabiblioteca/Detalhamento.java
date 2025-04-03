/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sitemabiblioteca;

/**
 *
 * @author Danielle
 */
public class Detalhamento {
    private String resumo;
    private int qtdPaginas, qtdCapitulos;
    
    public Detalhamento(String resumo, int qtdPaginas, int qtdCapitulos){
        this.resumo = resumo;
        this.qtdPaginas = qtdPaginas;
        this.qtdCapitulos = qtdCapitulos;
    }
    
    public String getResumo(){
        return resumo;
    }
    
    public int getQtdPag(){
        return qtdPaginas;
    }
    
    public int getQtdCap(){
        return qtdCapitulos;
    }
    
    @Override 
    public String toString(){
        return "\nResumo: "+resumo+", Qtd de Páginas: "+qtdPaginas+", Qtd de Capitulos: "+qtdCapitulos;
    }
}
