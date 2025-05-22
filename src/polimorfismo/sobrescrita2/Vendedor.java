package polimorfismo.sobrescrita2;

public class Vendedor extends Funcionario {
    private double valorVendido;
    private double percentualComissao;

    @Override
    public double getSalarioTotal() {
        double valorComissao = (valorVendido*percentualComissao/100);
        return getSalario() + getValeAlimentacao() + valorComissao;
    }


    public double getValorVendido() {
        return valorVendido;
    }
    public void setValorVendido(double valorVendido) {
        this.valorVendido = valorVendido;
    }
    public double getPercentualComissao() {
        return percentualComissao;
    }
    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    
}
