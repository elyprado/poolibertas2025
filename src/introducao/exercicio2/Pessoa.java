package introducao.exercicio2;

public class Pessoa {
    String nome;
    double peso;
    double altura;

    void alteraNome(String novoNome) {
        nome = novoNome;
    }

    //altere o codigo dos métodos alteraPeso e alteraAltura
    //para que aceite apenas alturas de 0.3 até 3 e que
    //o peso seja de 0.1 até 300. qualquer valor fora
    //estes permitidos deve ser impresso para o usuario
    //que o valor não é aceito. 
    //condições E = &&
    //condições OU = ||  

    void alteraPeso(double  novoPeso) {
        if (novoPeso >= 0.1 && novoPeso <= 300) {
            peso = novoPeso;
        } else {
            System.out.println("peso inválido!");
        }
    }
    void alteraAltura(double novaAltura) {
        if (novaAltura >= 0.3 && novaAltura <= 3) {
            altura = novaAltura;
        } else {
            System.out.println("altura inválida!");
        }
    }
    String retornaNome() {
        return nome;
    }
    double retornaPeso() {
        return peso;
    }
    double retornaAltura() {
        return altura;
    }
    double retornaIMC() {
        return peso / (altura * altura);
    }
}
