package modificadoresacesso.pacote1;
public class Pessoa {
    //atributos privados: são acessados apenas dentro
    //da própria classe
    private String nome;
    private int idade;
    //construtor deve ser sempre publico:
    //acessivel por qualquer classe
    public Pessoa(String novoNome, int novaIdade) {
        nome = novoNome;

        //if (novaIdade < 0 || novaIdade > 120) {
            //não aceita

        if (novaIdade >= 0 && novaIdade <= 120) {
            idade = novaIdade;
        } else {
            System.out.println("Idade inválida");
            idade = 0;
        }
        
    }
    //atributo publico: acessivel por qualquer classe
    public String pegaNome() {
        return nome;
    }
    public int pegaIdade() {
        return idade;
    }
    //atributo protegido: acessivel por outras classes
    //apenas do mesmo pacote
    protected void aniversario() {
        idade++;
    }

    public void alteraIdade(int novaIdade) {
        if (novaIdade >= 0 && novaIdade <= 120) {
            idade = novaIdade;
        } else {
            System.out.println("Idade inválida");
            idade = 0;
        }
    }
}
