package com.mycompany.aula20250522contacompleto;


public class ContaCorrente extends Conta implements iPix{
    public ContaCorrente(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor + 5) {
            saldo -= (valor + 5); // taxa de R$ 5,00
        } else {
            System.out.println("Saldo insuficiente na Conta Corrente.");
        }
    }

    @Override
    public void aplicarRendimento() {
        saldo *= 1.012; // 1,2%
    }

    @Override
    public String toString() {
        return "Conta Corrente - Saldo: R$ " + String.format("%.2f", saldo);
    }
    
    public String getTipoConta() {
        return "Conta Corrente";
    }
    
    @Override
    public void ReceberPix(double valor){
        this.saldo += valor;
    } 
}

