package polimorfismo.sobrescrita;

public class Mulher extends Pessoa {

    @Override
    public void agradecer() {
        System.out.println("Muito obrigada");
    }
}
