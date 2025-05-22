package polimorfismo.sobrescrita;

public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void agradecer() {
        System.out.println("estou agradecendo");
    }
}
