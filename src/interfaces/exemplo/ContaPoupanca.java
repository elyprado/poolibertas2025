package interfaces.exemplo;

public class ContaPoupanca implements Conta {
    private double saldo;
    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo: " + saldo);
    }
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }
    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("saldo insuficiente");
        }
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
