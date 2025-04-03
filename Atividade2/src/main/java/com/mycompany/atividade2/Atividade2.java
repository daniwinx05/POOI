

package com.mycompany.atividade2;


public class Atividade2 {

    public static void main(String[] args) {
        System.out.println("CARRO!");
        Motorista m1 = new Motorista("Marcelo", 2163546);
        Motorista m2 = new Motorista("Caio", 656565);
        Motorista m3 = new Motorista("João", 9879865);

        Carro c1 = new Carro("Sedan", m1, 250, "Gasolina" );
        Carro c2 = new Carro("SUV", m2, 150, "Diesel" );
        Carro c3 = new Carro("Picape", m3, 320, "Etanol" );
        
        c1.setMotorista(m1);
        System.out.println(c1);
        c2.setMotorista(m2);
        System.out.println(c2);
        c3.setMotorista(m3);
        System.out.println(c3);
        System.out.println(Motorista.qtdMotorista);
    }
}
