package associacao.exercicio1;

public class Main {
    public static void main(String[] args) {
        
        Cliente c1 = new Cliente();
        c1.setNome("Donald");
        c1.setTelefone("9999-9999");

        Pedido p1 = new Pedido();
        p1.setProduto("Açai");
        p1.setQuantidade(4);
        p1.setPreco(20);

        //associação
        p1.setCliente(c1);
        c1.getPedidos().add(p1);

        Pedido p2 = new Pedido();
        p2.setProduto("Pão de Queijo");
        p2.setQuantidade(20);
        p2.setPreco(15);

        //associação do pedido2
        p2.setCliente(c1);
        c1.getPedidos().add(p2);

        //exibe os dados:
        System.out.println("Cliente: " + c1.getNome());
        for (Pedido p: c1.getPedidos()) {
            System.out.println(p.getProduto());
        }
    }
}
