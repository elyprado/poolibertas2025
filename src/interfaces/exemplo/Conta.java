package interfaces.exemplo;

public interface Conta {
    public int limitePadrao = 100;
    public void mostrarSaldo();
    public void depositar(double valor);
    public void sacar(double valor);
}
