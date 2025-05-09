package modificadoresacesso.estatico;

public class Main {
    public static void main(String[] args) {
        
        Produto p1 = new Produto();
        p1.setDescricao("IPhone");
        p1.setPreco(999);
        Produto.setCotacaoDolar(5.66);

        
        Produto p2 = new Produto();
        p2.setDescricao("Macbook");
        p2.setPreco(1500);
        Produto.setCotacaoDolar(5.99);

        System.out.println(p1.getDescricao() + " - " + p1.getPrecoReal());
        System.out.println(p2.getDescricao() + " - " + p2.getPrecoReal());

    }
}
