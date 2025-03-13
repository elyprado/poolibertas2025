package construtores.exemplo;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa() {
        System.out.println("Construtor vazio");
    }
    public Pessoa(String novoNome) {
        nome = novoNome;
        System.out.println("Seja bem-vindo " + nome);
    }
    public Pessoa(int novaIdade, String novoNome) {
        nome = novoNome;
        idade = novaIdade;
        System.out.println("Seja bem-vindo " + nome + " de " + idade + " anos");
    }
    public Pessoa(String novoNome, int novaIdade) {
        nome = novoNome;
        idade = novaIdade;
        System.out.println("Seja bem-vindo " + nome + " de " + idade + " anos");
    }

}
