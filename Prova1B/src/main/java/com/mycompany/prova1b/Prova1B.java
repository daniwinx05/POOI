/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prova1b;

/**
 *
 * @author Danielle
 */
public class Prova1B {

    public static void main(String[] args) {
        System.out.println("Biblioteca UVV");
        Editora e1 = new Editora("ABELHA", "abelha123@email.com");
        Autor a1 = new Autor("Pedro Alvares", "P.A");
        a1.adicionarContato("Telefone", "2855465632");
        Livro i1 = new Livro("Descobrindo", 1500, a1, e1);
        System.out.println(i1.toString());
        
    }
}
