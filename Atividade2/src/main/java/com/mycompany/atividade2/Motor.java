
package com.mycompany.atividade2;


public class Motor {
    private int potencia;
    private String tipoCombust;
    
    public Motor(int potencia, String tipoCombust){
        this.potencia = potencia;
        this.tipoCombust = tipoCombust;
    
    }

    @Override
    public String toString(){
        return "\nPotência: "+potencia+
                "\nCombustível: "+tipoCombust;
    }
    
    public int getPotencia(){
        return potencia;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }

    public String getTipoCombust() {
        return tipoCombust;
    }

    public void setTipoCombust(String tipoCombust) {
        this.tipoCombust = tipoCombust;
    }

    
}
