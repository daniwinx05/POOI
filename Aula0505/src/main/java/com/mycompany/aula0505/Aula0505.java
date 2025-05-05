/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula0505;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alunolab02
 */
public class Aula0505 {

    public static void main(String[] args) {
        
       /* Produto p1 = new Produto("TV", 1.000);
        p1.ehCaro();*/
       Eletronico e1 = new Eletronico(110, "cafeteira", 150.9);
        Livro l1 = new Livro("Vasco da Gama", 300, "Descobrir", 600.9);
        l1.ehCaro();
        l1.ehGrande();
        l1.ehGrande(true);
        
        List<Produto> listaGenerica = new ArrayList<>();
        listaGenerica.add(e1);
        listaGenerica.add(l1);
        
        for (Produto p: listaGenerica){
            System.out.println(p.nome);
            p.ehCaro();
            /*p.ehGrande();*/ //fazer esse é grande funcionar para o livro
        }
        
    }
}
