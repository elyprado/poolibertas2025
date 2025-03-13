package introducao.exercicio5;

public class Conta {
    String dono;
    int numero;
    double saldo;
    double limite;

    public Conta() {
        dono = "Fulano";
        numero = 123;
        saldo = 0;
        limite = 100;
    }

    void saque(double quantidade) {
        if (quantidade > saldo + limite) {
            System.out.println(("Saldo insuficiente"));
        } else {
            //saldo = saldo - quantidade;
            saldo -= quantidade;
        }
    }
    void deposito(double quantidade) {
        //saldo = saldo + quantidade;
        saldo += quantidade;
    }
    double verificaSaldo() {
        return saldo;
    }
    double verificaLimite() {
        return limite;
    }
    void alteraLimite(double novoLimite) {
        limite = novoLimite;
    }
    void aumentaLimite(double quantidade) {
        limite += quantidade;
    }
    void diminuiLimite(double quantidade) {
        limite -= quantidade;
    }
}
