package interfaces.exercicio1;

public class Adicao implements OperacaoMatematica {

    @Override
    public void calcular(double a, double b) {
        double r = a+b;
        System.out.println("Soma: " + r);
    }

}
