/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste2;

/**
 *
 * @author Danielle
 */
public class Aluno {
    private String nome;
    private Professor professor;
    
    public Aluno(String nome){
        this.nome = nome;
        
    }
    
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    
}
