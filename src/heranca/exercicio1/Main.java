package heranca.exercicio1;

public class Main {
    public static void main(String[] args) {
        Motorista motorista = new Motorista();
        motorista.setNome("Bill Gates");
        motorista.setCategoria("B");
        motorista.setCpf("123.123.123-12");
        motorista.setIdade(50);
        motorista.setNumerocnh("123");
        motorista.aniversario();

        Moto m = new Moto();
        m.setAno(2023);
        m.setCapacete("aberto");
        m.setMarca("honda");
        m.setModelo("cbx750");
        m.setPlaca("XXX1234");
        m.setMotorista(motorista);

        Carro c = new Carro();
        c.setAno(2020);
        c.setCapacidade(4);
        c.setMarca("vw");
        c.setModelo("fusca");
        c.setPlaca("WWW1234");
        c.setMotorista(motorista);

    }
}
