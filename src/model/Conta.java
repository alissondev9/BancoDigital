package model;

public abstract class Conta {
    private String numero;
    private String titular;
    protected double saldo; // saldo protegido para herança

    public Conta(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Encapsulamento: getters e setters
    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // Abstração: métodos comuns a todas as contas
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    public void transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " realizada para " + destino.getTitular());
        }
    }

    // Método abstrato para mostrar detalhes da conta
    public abstract void mostrarInfo();
}
