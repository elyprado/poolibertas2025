package construtores.exercicio1;

public class Retangulo {
    double altura;
    double lado;

    public Retangulo(double novoLado) {
        lado = novoLado;
    }
    public Retangulo() {

    }
    public Retangulo(double novoLado, double novaAltura) {
        lado = novoLado;
        altura = novaAltura;
    }
    public double calcularArea() {
        return lado * altura;
    }

}
