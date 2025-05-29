package interfaces.exemplo;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<Conta> contas = new LinkedList<>();

        ContaCorrente cc = new ContaCorrente();
        cc.depositar(1000);
        cc.sacar(200);
        contas.add(cc);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500);
        cp.sacar(50);
        contas.add(cp);

        for (Conta conta : contas) {
            conta.mostrarSaldo();
        }
    }
}
