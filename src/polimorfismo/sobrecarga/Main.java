package polimorfismo.sobrecarga;

public class Main {
    public static void main(String[] args) {
        
        Calculadora c = new Calculadora();

        System.out.println("Soma: " + c.somar(2,2));
        System.out.println("Soma: " + c.somar(2.3,2.5));
        System.out.println("Soma: " + c.somar("2.3","2.5"));
        System.out.println("Soma: " + c.somar(1,2,3));
        System.out.println("Soma: " + c.somar(1,2,3,4));
        System.out.println("Soma: " + c.somar(1,2,3.1,4.2));

    }
}
