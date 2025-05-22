package classesabstratas.exemplo1;

public abstract class Veiculo {
    private String modelo;
    private String marca;

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public abstract String getNomeImposto();
    public abstract double getValorImposto(double valorDoVeiculo);
    
}
