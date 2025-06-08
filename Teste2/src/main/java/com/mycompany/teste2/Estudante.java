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
public class Estudante {
    private String nome;
    private List<Curso> cursos = new ArrayList<>();
    
    public Estudante(String nome){
        this.nome = nome;
    }


    public void inscreverEmCurso(Curso curso){
        this.cursos.add(curso);
        curso.adcionarEstudante(this);
    }
}

