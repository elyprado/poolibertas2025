package interfaces.exercicio2;

public class Main {
    public static void main(String[] args) {
        
        RadioRelogio rr = new RadioRelogio();
        rr.ajustarHorario();
        rr.mostrarHorario();
        rr.aumentarVolume();
        rr.diminuirVolume();
        rr.mudarEstacao();

    }
}
