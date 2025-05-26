/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadefolricultura;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danielle
 */
public class Pedido {
    public Cliente clientes;
    public List<Flor> flores;
    
    public Pedido(Cliente cliente){
     this.clientes = cliente;
     this.flores = new ArrayList<>();
    
    }
    
     public void adicionarFlor(Flor flores){
        this.flores.add(flores);
     }
     
     public double calcularTotalPedido(){
         double total = 0;
         for(Flor f : flores){
         total += f.calcularPrecoTotal();
         
         }
         return total;
     }
     
     public void exibirResumo(){
         clientes.dadosCliente();
         for(Flor f : flores){
             f.exibirInfo();
         }
         System.out.println("Preço total do pedido: R$"+calcularTotalPedido());
         System.out.println("-----------------------------------------------");
     }
     
}
