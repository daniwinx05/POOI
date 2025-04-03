
package com.mycompany.teste1;
import java.util.Random;
public class Teste1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
       Pessoa pessoa = new Pessoa("Maria", 25);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade: " + pessoa.getIdade());
        
        
        
        
   
        int tamanho = 10; // Tamanho do array
        int[] numeros = new int[tamanho]; // Criando o array

        Random random = new Random(); // Instância do gerador de números aleatórios

        // Preenchendo o array com números aleatórios entre 0000 e 9999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(10000); // Gera números entre 0 e 9999
        }

        // Exibindo os números gerados com 4 dígitos
        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.printf("%04d ", num); // Exibe sempre com 4 dígitos
        }
        
    }
}





