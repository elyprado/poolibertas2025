package polimorfismo.sobrescrita;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Pessoa> lista = new LinkedList<>();

        Pessoa p = new Pessoa();
        p.setNome("Bill");
        lista.add(p);

        Homem h = new Homem();
        h.setNome("Steve");
        lista.add(h);

        Mulher m = new Mulher();
        m.setNome("Ada Lovelace");
        lista.add(m);
        
        for (Pessoa p1 : lista) {
            p1.agradecer();
        }
    }
}
