package model;

public class ContaCorrente extends Conta {
    private double limite; // Limite especial da conta corrente

    public ContaCorrente(String numero, String titular, double saldoInicial, double limite) {
        super(numero, titular, saldoInicial);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {
        // Conta corrente permite usar o limite
        if (valor > 0 && saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso na conta corrente!");
            return true;
        } else {
            System.out.println("Saldo + limite insuficiente.");
            return false;
        }
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Conta Corrente: " + getNumero() + " | Titular: " + getTitular() + " | Saldo: " + saldo + " | Limite: " + limite);
    }
}
