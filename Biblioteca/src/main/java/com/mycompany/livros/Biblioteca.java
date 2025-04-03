
package com.mycompany.livros;

public class Biblioteca {

    public static void main(String[] args) {
        System.out.println("BIBLIOTECA!");
        
        Livros lv1 = new Livros("Cavalo Amarelo", "Agatha Christie", 1961, 10);
        lv1.Dispoivel(2);
        System.out.println(lv1);
        
        Livros lv2 = new Livros("A Noite das Bruxas", "Agatha Christie", 1969, 5);
        lv2.Dispoivel(8);
        System.out.println(lv2);
        
        System.out.println(Livros.getQtd());
    }
}
