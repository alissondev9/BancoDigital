package service;

import model.Conta;
import java.util.ArrayList;
import java.util.List;

public class BancoService {
    private List<Conta> contas;

    public BancoService() {
        contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("=== Contas do Banco ===");
        for (Conta c : contas) {
            c.mostrarInfo();
        }
    }

    public Conta buscarConta(String numero) {
        for (Conta c : contas) {
            if (c.getNumero().equals(numero)) {
                return c;
            }
        }
        return null;
    }
}
