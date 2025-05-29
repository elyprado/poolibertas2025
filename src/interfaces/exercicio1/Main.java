package interfaces.exercicio1;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        
        LinkedList<OperacaoMatematica> operacoes = new LinkedList<>();

        operacoes.add(new Adicao());

        Subtracao s = new Subtracao();
        operacoes.add(s);

        operacoes.add(new Multiplicacao());
        operacoes.add(new Divisao());


        for (OperacaoMatematica o : operacoes) {
            o.calcular(12, 2);
        }


    }
}
