
package com.mycompany.atividade2;


public class Carro {
    private String modelo;
    private Motorista motorista;
    private Motor motor;
    public static int qtdCarro;
    
   
    public Carro(String modelo, Motorista motorista, int potencia, String tipoCombust ){
        this.modelo = modelo;
        this.motorista = motorista;
        motor = new Motor(potencia, tipoCombust);
        qtdCarro++;
        
    }
    
    public static int getQtdcarro(){
        return qtdCarro;
    }

   @Override
   public String toString(){
       return "\nModelo: " + modelo
               +motorista
               +motor;
   
   }
    
    
    public String getModelo(){
        return modelo;
    }

 
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public Motorista getMot(){
        return motorista;
    }
    
    public Motor getMotor(){
    return motor;
    }
   
   public Motorista getMotorista(){
       return motorista;
   }
    
    public void setMotorista(Motorista motorista){
        this.motorista = motorista;
    }
    
}
