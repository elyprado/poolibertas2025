package classesabstratas.exemplo1;

public class Main {
    public static void main(String[] args) {
        
        Carro c = new Carro();
        Barco b = new Barco();
        Aviao a = new Aviao();

        c.setModelo("Fusca");
        c.setMarca("VW");
        c.setPlaca("XXX1234");
        System.out.println(c.getModelo() + " " + c.getNomeImposto());
        System.out.println(c.getValorImposto(10000));

        b.setModelo("Veleiro");
        b.setMarca("Atlantico");
        b.setNumeroRegistro(1234);
        System.out.println(b.getModelo() + " " + b.getNomeImposto());
        System.out.println(b.getValorImposto(150000));

        a.setModelo("P133");
        a.setMarca("Airbus");
        a.setNumeroAnac(321);
        System.out.println(a.getModelo() +" " + a.getNomeImposto());
        System.out.println(a.getValorImposto(800000));

        //Declare um método abstrato double getValorImposto(double valorDoVeiculo)
        //implemente este método nas classes filhas
        //Para Carro calcule 4% de imposto sobre o valor do veiculo recebido por 
        //parametro
        //Para Barco calcule 8% de imposto
        //Para Avião calcule 12% de imposto
    }
}
