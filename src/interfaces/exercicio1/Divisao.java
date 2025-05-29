package interfaces.exercicio1;

public class Divisao implements OperacaoMatematica {

    public void calcular(double a, double b) {
        if (b==0) {
            System.out.println("não posso dividir por zero");
            return;
        }
        double r = a/b;
        System.out.println("Divisão: " + r);
    }

    public void calcular(int a, int b) {
        if (b==0) {
            System.out.println("não posso dividir por zero");
            return;
        }
        double r = a/b;
        System.out.println("Divisão: " + r);
    }
}
