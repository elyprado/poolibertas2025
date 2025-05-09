package modificadoresacesso.estatico;

public class Pessoa {
    private String nome;
    private String telefone;
    private String email;
    private static int contador;

    public Pessoa() {
        contador++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public static void setContador(int contador) {
        Pessoa.contador = contador;
    }
 
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public static int getContador() {
        return contador;
    }
}
