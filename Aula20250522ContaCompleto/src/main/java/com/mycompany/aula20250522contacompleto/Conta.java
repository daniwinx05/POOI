package com.mycompany.aula20250522contacompleto;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public abstract void sacar(double valor);

    public abstract void aplicarRendimento();

    public double getSaldo() {
        return saldo;
    }
    
    public String getTipoConta() {
        return "Conta Simples";
    }

    @Override
    public String toString() {
        return "Conta{" + "saldo=" + saldo + '}';
    }
    
    
}
