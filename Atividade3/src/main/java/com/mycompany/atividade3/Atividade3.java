
package com.mycompany.atividade3;


public class Atividade3 {

    public static void main(String[] args) {
        System.out.println("AGENDA TELEFONICA!");
        AgendaTelefonicaList ag = new AgendaTelefonicaList();
        ag.inserir("Dani", "27979856");
        ag.inserir("Alex", "27545321321");
        ag.inserir("Laura", "454544322");
        ag.inserir("Lais", "213213445");
        ag.inserir("Pedro", "334654454");
        ag.inserir("Maria", "278455951");
        ag.imprimir();
        ag.buscarNome("Dani");
        ag.remover("Pedro");
       
    }
}
