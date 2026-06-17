package POO;

public class Aluno {
    String nome;
    double nota1;
    double nota2;
    private double media;

    public void CalcularMedia() {
       media = (nota1 + nota2) / 2;
    }

    public void ResultadoAluno() {
        System.out.println("Nome do aluno: " + nome);
        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Media: " + media);
        if (media >= 7) {
            System.out.println(" ALUNO APROVADO !!");
        } else {
            System.out.println("ALUNO REPROVADO !!");
        }
    }
}
