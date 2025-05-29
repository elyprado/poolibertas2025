package interfaces.exercicio1;

public class Subtracao implements OperacaoMatematica {

    @Override
    public void calcular(double a, double b) {
        double r = a-b;
        System.out.println("Subtração: " + r);
    }

    
}
