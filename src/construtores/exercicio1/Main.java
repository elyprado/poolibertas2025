package construtores.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Retangulo r1 = new Retangulo();
            r1.lado = 10;
            r1.altura = 20;
            System.out.println("Área: " + r1.calcularArea());

           Retangulo r2 = new Retangulo(25); //passei o lado
           r2.altura = 12;
           System.out.println("Área: " + r2.calcularArea());

           Retangulo r3 = new Retangulo(30,40);
           System.out.println("Área: " + r3.calcularArea());


           Scanner sc = new Scanner(System.in);
           int opcao = 0;
           while (opcao !=2) {
                System.out.println("MENU");
                System.out.println("1 - Digitar medidas de um novo retângulo");
                System.out.println("2 - Sair");
                System.out.println("Digite a opção desejada:");
                opcao = Integer.parseInt(sc.nextLine());
                if (opcao == 1) {
                    Retangulo r = new Retangulo();
                    System.out.println("Digite a altura do retangulo: ");
                    r.altura = Double.parseDouble(sc.nextLine());
                    System.out.println("Digite a largura do retangulo:");
                    r.lado = Double.parseDouble(sc.nextLine());
                    System.out.println("Area: " + r.calcularArea());

                }
           }


    }
}
