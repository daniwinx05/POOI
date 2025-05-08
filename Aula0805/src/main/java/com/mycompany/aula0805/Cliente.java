/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula0805;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab02
 */
public class Cliente {
    private String nome;
    private String CPF;
    private List<Conta> contas;
    
    
    public Cliente(String nome, String cpf, double saldo){
        this.nome = nome;
        this.CPF = cpf;
        this.contas = new ArrayList<>();
    
    }
    
    public void mostrarSaldo(){
        System.out.println("Seu saldo é de: R$"+contas);
    }
    
    
}
