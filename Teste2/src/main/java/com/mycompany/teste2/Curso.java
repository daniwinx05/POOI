/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielle
 */
public class Curso {
    private String nome;
    private List<Estudante> estudantes = new ArrayList<>();
    
    public Curso(String nome){
        this.nome = nome;
    }
    
    public void adcionarEstudante(Estudante estudante){
        this.estudantes.add(estudante);
        estudante.inscreverEmCurso(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }
   
    
    
    
    
}
