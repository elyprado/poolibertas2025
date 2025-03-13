package exercicio3;

public class Veiculo {
    String placa;
    String modelo;
    String marca;
    int anoFabricacao;
    double valor;

    public Veiculo() {
        System.out.println("construindo o objeto Veiculo");
        anoFabricacao = 2000;
    }


    int idade() {
        return 2025 - anoFabricacao;
    }
    double valorIPVA() {
        if (anoFabricacao < 1970) {
            return 0;
        } else {
            return valor * 4 / 100;
        }
    }
    double valorSeguro() {
        return valor * 6 / 100;
    }
}
