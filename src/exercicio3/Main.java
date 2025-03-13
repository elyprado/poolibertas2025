package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Veiculo vei = new Veiculo();

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a placa do veículo: ");
        vei.placa = in.nextLine();

        System.out.println("Digite o modelo: ");
        vei.modelo = in.nextLine();

        System.out.println("Digite a marca: ");
        vei.marca = in.nextLine();

        //System.out.println("Digite o ano de fabricação: ");
        //vei.anoFabricacao = Integer.parseInt(in.nextLine());

        System.out.println("Digite o valor: ");
        vei.valor = Double.parseDouble(in.nextLine());

        System.out.println("Valor do IPVA: " + vei.valorIPVA());
        System.out.println("Valor do Seguro: " + vei.valorSeguro());
        System.out.println("Ano: " + vei.anoFabricacao);

    }
}
