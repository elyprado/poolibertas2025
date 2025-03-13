package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);

        Conta conta = new Conta();

        int opcao = 0;
        while (opcao != 6) {
            //exibe as informações da conta
            System.out.println("------------------------------");
            System.out.println("Dono da conta: " + conta.dono);
            System.out.println("Número da conta: " + conta.numero);
            System.out.println("Saldo: " + conta.verificaSaldo());
            System.out.println("Limite: " + conta.verificaLimite());
            System.out.println("------------------------------");
            System.out.println("1 - Saque");
            System.out.println("2 - Depósito");
            System.out.println("3 - Alterar Limite");
            System.out.println("4 - Aumentar Limite");
            System.out.println("5 - Diminuir Limite");
            System.out.println("6 - Sair");
            System.out.println("Digite a opção desejada: ");

            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor do saque: ");
                    double quantidade = Double.parseDouble(sc.nextLine());
                    conta.saque(quantidade);
                    break;
                case 2:
                    System.out.println("Digite o valor do depósito: ");
                    quantidade = Double.parseDouble(sc.nextLine());
                    conta.deposito(quantidade);
                    break;
                case 3:
                    System.out.println("Digite o valor do novo limite: ");
                    quantidade = Double.parseDouble(sc.nextLine());
                    conta.alteraLimite(quantidade);
                    break;
                case 4:
                    System.out.println("Digite o valor para adicionar ao limite: ");
                    quantidade = Double.parseDouble(sc.nextLine());
                    conta.aumentaLimite(quantidade);
                    break;
                case 5:
                    System.out.println("Digite o valor para diminuir do limite: ");
                    quantidade = Double.parseDouble(sc.nextLine());
                    conta.diminuiLimite(quantidade);
                    break;
                case 6:
                    //sair
                    break;
                default: 
                    System.out.println("Opção inválida");
                    break;
            }

        }


    }
}
