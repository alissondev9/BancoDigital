package app;

import model.ContaCorrente;
import model.ContaPoupanca;
import service.BancoService;

public class Main {
    public static void main(String[] args) {
        BancoService banco = new BancoService();

        ContaCorrente cc = new ContaCorrente("001", "Pedro", 1000.0, 500.0);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 2000.0);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        banco.listarContas();

        cc.depositar(200);
        cp.sacar(500);

        cc.transferir(cp, 300);

        banco.listarContas();
    }
}
