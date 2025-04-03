package associacao.exercicio1;

public class Pedido {
    private String produto;
    private int quantidade;
    private double preco;
    private Cliente cliente;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    public String getProduto() {
        return produto;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
}
