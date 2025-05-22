package polimorfismo.sobrescrita2;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Funcionario.setValeAlimentacao(600);

        LinkedList<Funcionario> lista = new LinkedList<>();

        Funcionario f = new Funcionario();
        f.setNome("Bill");
        f.setCpf("123.123.123-12");
        f.setSalario(3000);
        lista.add(f);
        
        Vendedor v = new Vendedor();
        v.setNome("Steve");
        v.setCpf("321.321.311.11");
        v.setSalario(5000);
        v.setPercentualComissao(10);
        v.setValorVendido(50000);
        lista.add(v);
        
        Horista h = new Horista();
        h.setNome("Ada Lovelace");
        h.setCpf("111.111.111-11");
        h.setSalario(5000);
        h.setHorasTrabalhadas(320);
        lista.add(h);

        for (Funcionario fun : lista) {
            System.out.println(fun.getNome() + " " + fun.getSalarioTotal());
        }

    }


}
