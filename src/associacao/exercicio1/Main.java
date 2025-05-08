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


        Cliente c2 = new Cliente();
        c2.setNome("Patinhas");
        c2.setTelefone("1233-9999");

        Pedido p3 = new Pedido();
        p3.setProduto("Coviar");
        p3.setQuantidade(4);
        p3.setPreco(200);

        Pedido p4 = new Pedido();
        p4.setProduto("Picanha");
        p4.setQuantidade(1);
        p4.setPreco(80);

        Pedido p5 = new Pedido();
        p5.setProduto("Uisque");
        p5.setQuantidade(1);
        p5.setPreco(300);

        c2.getPedidos().add(p3);
        c2.getPedidos().add(p4);
        c2.getPedidos().add(p5);

        p3.setCliente(c2);
        p4.setCliente(c2);
        p5.setCliente(c2);
    }
}
