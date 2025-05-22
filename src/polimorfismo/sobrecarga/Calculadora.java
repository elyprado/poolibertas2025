package polimorfismo.sobrecarga;

public class Calculadora {

/*somar 2 números inteiros
somar 2 números double
somar 2 número String (faça a conversão de tipo)
somar 3 números inteiros
somar 4 números inteiros
somar 2 números inteiros e 2 números double
*/

    public int somar(int a, int b) {
        return a+b;
    }
    public double somar(double a, double b) {
        return a+b;
    }
    public String somar(String a, String b) {
        return String.valueOf(Double.parseDouble(a) + Double.parseDouble(b));
    }
    public int somar(int a, int b, int c) {
        return a+b+c;
    }
    public int somar(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    public double somar(int a, int b, double c, double d) {
        return a+b+c+d;
    }
}
