package modificadoresacesso.pacote2;

import modificadoresacesso.pacote1.Pessoa;

public class Main2 {
    public static void main(String[] args) {
        

        //altere o construtor para permitir idade apenas
        //entre 0 a 120. qualquer idade foram deste 
        //intervalo, atribua 0 para a idade e mostre 
        //uma mensagem informando o usuário de que o 
        //valor é inválido

        //crie um método chamado alteraIdade que receba
        //uma nova idade e tenha os mesmos critérios
        //do construtor para aceitar apenas idades
        //entre 0 e 120 anos.

        Pessoa p = new Pessoa("Bill", 500);
        //p.aniversario();

        System.out.println("Nome: " + p.pegaNome());
        System.out.println("Idade: " + p.pegaIdade());
    }
}
