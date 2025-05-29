package interfaces.exercicio1;

public class Multiplicacao implements OperacaoMatematica {

    @Override
    public void calcular(double a, double b) {
        double r = a*b;
        System.out.println("Multiplicação: " + r);
    }
    
}
