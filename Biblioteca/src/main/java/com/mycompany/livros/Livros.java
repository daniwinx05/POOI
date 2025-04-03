
package com.mycompany.livros;
import java.util.Random;


public class Livros {
    private String codigo; //gerado automaticamente com o prefixo "LV" e 6 dígitos aleatórios (ex: "LV123456").
    private String titulo; //Título do livro (sempre em maiúsculas).
    private String autor;
    private int anoPublicado;
    private double disponivel;
    public static int  qtdLivros = 0;
    
    public Livros (String titulo, String autor, int anoPublicado, double disponivel){
        
        this.codigo = livroCodigo();
        this.titulo = titulo.toUpperCase();
        this.autor = autor;
        this.anoPublicado = anoPublicado;
        this.disponivel = disponivel;
        qtdLivros++;
    }
    
   
    
    @Override
    public String toString(){
        return """
               ============================================
               Codigo: """ +codigo+ 
                "\nTitulo do Livro: " +titulo+ 
                "\nAutor(a): " +autor+
                "\nAno Publicado: " +anoPublicado+ 
                "\nDisponível: " +disponivel +
                "\n============================================" ;
    }
    
    public static int getQtd(){
        return qtdLivros;
    }
    
    public String getCodigo(){
        return codigo;
    }
    
    public String getTilulo(){
        return titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor(){
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public int getAnoP(){
        return anoPublicado;
    }
    public void setAnoP(int anoPublicado){
        this.anoPublicado =  anoPublicado;
    }
    
    public double getDisponivel(){
        return disponivel;
    }
    
     private String livroCodigo(){
        Random rand = new Random();
        int num = rand.nextInt(100000);
        return  "LV" + String.format("%06d", num);
    }
    
    public boolean Dispoivel(double d){
       if(d > disponivel){
           System.out.println("\nO valor inserido é superior a disponibilidade do livro "+ titulo +"!");
           return false;
       }else{
           disponivel -= d;
       System.out.println("\nEmpréstimo do livro " + titulo+ " realizado com sucesso!");
       return true;
       }
       
    }
    
    
    
    
}
