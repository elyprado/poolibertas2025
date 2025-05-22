package polimorfismo.sobrescrita2;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;
    private static double valeAlimentacao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public static double getValeAlimentacao() {
        return valeAlimentacao;
    }
    public static void setValeAlimentacao(double valeAlimentacao) {
        Funcionario.valeAlimentacao = valeAlimentacao;
    }

    public double getSalarioTotal() {
        return salario+valeAlimentacao;
    }
}
