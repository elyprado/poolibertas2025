package modificadoresacesso.modificadorfinal;

public final class Pessoa {
    private String nome;
    private double altura;
    private double peso;
    private final double IMCMINIMO = 25;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getIMCMINIMO() {
        return IMCMINIMO;
    }

    //gets e sets
    

    //implemente o método calculaimc
    //imc = peso / altura * altura

    public double calculaImc() {
        return peso / altura * altura;
    }
    public double calculaImc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
        return peso / altura * altura;
    }

    //implemente outro método chamado
    //verificaimc, que vai calcular
    //o imc e retornar true se a pessoa
    //está com imc <= IMCMINIMO
    public boolean verificaImc() {
        if (calculaImc() <= IMCMINIMO) {
            return true;
        } else {
            return false;
        }
    }
}
