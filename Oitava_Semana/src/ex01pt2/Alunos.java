package ex01pt2;

public class Alunos {
    private String nome;
    private double notaA, notaB, media;

    public Alunos(){}

    public Alunos(String nome, double notaA, double notaB, double media) {
        this.nome = nome;
        this.notaA = notaA;
        this.notaB = notaB;
        this.media = media;
    }

    public double getNotaA() {
        return notaA;
    }

    public double getNotaB() {
        return notaB;
    }

    @Override
    public String toString() {
        return "Alunos{" +
                "nome='" + nome + '\'' +
                ", notaA=" + notaA +
                ", notaB=" + notaB +
                ", media=" + media +
                '}';
    }

    public double getMedia() {
        return media;
    }
}
