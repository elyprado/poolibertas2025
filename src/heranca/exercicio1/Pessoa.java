package heranca.exercicio1;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;

    public void aniversario() {
        idade++;
    }

    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
