package polimorfismo.sobrescrita2;

public class Horista extends Funcionario {
    private double horasTrabalhadas;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double getSalarioTotal() {
        double salario = getSalario()/160*horasTrabalhadas;
        return salario+getValeAlimentacao();
    }
}
