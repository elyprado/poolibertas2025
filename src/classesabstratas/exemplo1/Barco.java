package classesabstratas.exemplo1;

public class Barco extends Veiculo {
    private int numeroRegistro;

    public String getNomeImposto() {
        return "IMPOSTO PORTUÁRIO";
    }

    public int getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(int numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    @Override
    public double getValorImposto(double valorDoVeiculo) {
        return valorDoVeiculo * 8 / 100;
    }
}
