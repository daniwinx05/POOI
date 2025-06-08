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
public class Professor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    
    public Professor(String nome){
        this.nome = nome;
    }
    
    public void adiocionarAluno(Aluno aluno){
        alunos.add(aluno);
        aluno.setProfessor(this);
    }
}
