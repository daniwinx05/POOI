/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author Danielle
 */
public class Atividade4 {

    public static void main(String[] args) {
        System.out.println("EVENTOS ABC!");
        Evento e = new Evento("ABC");
        e.Inserir("Maria", "maria.silva@email.com");
        e.Inserir("Pedro", "pedro.oliveira@email.com");
        e.Inserir("Carla", "carla.rodrigues@email.com");
        e.Inserir("Lucas", "lucas.santos@email.com");
        e.Inserir("Mariana", "mariana.costa@email.com");
        e.remover("pedro.oliveira@email.com");
        e.ListaPart();
    }
}
