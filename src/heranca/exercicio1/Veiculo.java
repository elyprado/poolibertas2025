package heranca.exercicio1;

public class Veiculo {
    private String modelo;
    private String marca;
    private String placa;
    private int ano;
    private Motorista motorista;

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public String getModelo() {
        return modelo;
    }
    public String getMarca() {
        return marca;
    }
    public String getPlaca() {
        return placa;
    }
    public int getAno() {
        return ano;
    }
    public Motorista geMotorista() {
        return motorista;
    }

}
