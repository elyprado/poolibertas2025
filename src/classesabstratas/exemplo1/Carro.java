package classesabstratas.exemplo1;

public class Carro extends Veiculo {
    private String placa;

    public String getNomeImposto() {
        return "IPVA";
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double getValorImposto(double valorDoVeiculo) {
        return valorDoVeiculo * 4 / 100;
    }

    
}
