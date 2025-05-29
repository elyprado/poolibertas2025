package interfaces.exercicio2;

public class RadioRelogio implements Radio, Relogio {
    public void ajustarHorario() {
        System.out.println("ajustando horário");
    }
    public void mostrarHorario() {
        System.out.println("mostrando horario");
    }
    public void mudarEstacao() {
        System.out.println("mudando estação");
    }
    public void aumentarVolume() {
        System.out.println("aumentando volume");
    }
    public void diminuirVolume() {
        System.out.println("diminuindo volume");
    }

}
