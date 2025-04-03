package associacao.exercicio1;

import java.util.LinkedList;

public class Cliente {
    private String nome;
    private String telefone;
    private LinkedList<Pedido> pedidos = new LinkedList<>();

    public LinkedList<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(LinkedList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
