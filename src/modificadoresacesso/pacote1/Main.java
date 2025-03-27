package modificadoresacesso.pacote1;

public class Main {
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa("Bill", 50);
        p.aniversario();

        System.out.println("Nome: " + p.pegaNome());
        System.out.println("Idade: " + p.pegaIdade());
    }
}
