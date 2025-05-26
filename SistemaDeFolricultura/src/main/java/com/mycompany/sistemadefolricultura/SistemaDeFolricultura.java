/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadefolricultura;

/**
 *
 * @author Danielle
 */
public class SistemaDeFolricultura {

    public static void main(String[] args) {
        System.out.println("FloriAr");
        Flor f1 = new FlorSimples("Margarida", 5.00, 15);
        Flor f2 = new FlorSimples("Lírios", 8.00, 4);
        Flor f3 = new Arranjo("Arranjo Especial", "Rosas", 6.00, 20);
        
        Cliente c1 = new Cliente("Maria", "269935243");
        Cliente c2 = new Cliente("Pedro", "279987654");
        
        Pedido p2 = new Pedido(c2);
        Pedido p1 = new Pedido(c1);
        p1.adicionarFlor(f3);
        p1.adicionarFlor(f1);
        p2.adicionarFlor(f2);
        
        
        
        p1.exibirResumo();
        p2.exibirResumo();
        
        
    }
}
