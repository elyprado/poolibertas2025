package introducao.exercicio1;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    double media;

    void calcularMedia() {
        media = (nota1 + nota2) / 2;
        if (media < 70 && media >= 69.8) {
            media = 70;
        }
    }
}
