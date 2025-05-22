package classesabstratas.exemplo1;

public class Aviao extends Veiculo {
    private int numeroAnac;

    public String getNomeImposto() {
        return "IMPOSTO ANAC";
    }

    public int getNumeroAnac() {
        return numeroAnac;
    }

    public void setNumeroAnac(int numeroAnac) {
        this.numeroAnac = numeroAnac;
    }

    @Override
    public double getValorImposto(double valorDoVeiculo) {
        return valorDoVeiculo * 12 / 100;
    }

}
