package com.mycompany.aula20250508herancaclienteconta;

public class Conta {
    protected double saldo;

    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (this.saldo >= valor) {
            saldo -= valor;
        }
    }

    public void aplicarRendimento(){
        this.saldo = this.saldo*1;
    }

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
