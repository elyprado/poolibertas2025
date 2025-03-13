package construtores.exemplo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();

        Pessoa p2 = new Pessoa("Bill Gates");

        Pessoa p3 = new Pessoa("Steve Jobs", 56);

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        Pessoa p4 = new Pessoa(sc.nextLine());

        System.out.println("Digite o nome e a idade: ");
        Pessoa p5 = new Pessoa(sc.nextLine(), Integer.parseInt(sc.nextLine()));

    }
}
