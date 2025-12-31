package model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, String titular, double saldoInicial) {
        super(numero, titular, saldoInicial);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Conta Poupança: " + getNumero() + " | Titular: " + getTitular() + " | Saldo: " + saldo);
    }
}
