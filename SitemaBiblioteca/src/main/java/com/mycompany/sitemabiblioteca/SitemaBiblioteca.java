
package com.mycompany.sitemabiblioteca;


public class SitemaBiblioteca {

    public static void main(String[] args) {
        System.out.println("BIBLIOTECA UVV!");
        Bibliotecario b1 = new Bibliotecario("Pedro", 1567);
        Detalhamento d1 = new Detalhamento("resumo", 100, 10);
        Editora e1 = new Editora("ABC", "ES");
        Livro li = new Livro("Cavalo Amarelo", 1961, "Agatha Christie", "Inglesa",b1,e1,d1);
        Bibliotecario b2 = new Bibliotecario("Ana", 456);
        Editora e2 = new Editora("Darkside", "São Paulo");
        li.SetRespon(e2, b2);
        System.out.println(li);
        
        
    }
}
