package ex06;

import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Aluno> alunos;
    private double maiorMedia = 0;
    private double menorMedia = 11, maiorNota = 0, menorNota = 11;

    public Disciplina() {
        alunos = new ArrayList<>();
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void exibeNotas(){
        System.out.printf("%s\t %s\t %s\t %s\n", "Estudante: ", "A", "B", "Média");
        for (Aluno al : alunos){
            double media = (al.getNotaA() + al.getNotaB())/2;
            if (media > maiorMedia) maiorMedia = media;
            if (media < menorMedia) menorMedia = media;
            System.out.printf("%s\t %.2f\t %.2f\t %.2f\n", al.getNome(), al.getNotaA(), al.getNotaB(), media);
        }
    }

    public void exibeMedias(){
        for (Aluno al : alunos){
            if (al.getNotaA() > maiorNota) maiorNota = al.getNotaA();
            if (al.getNotaA() < menorNota) menorNota = al.getNotaA();
            if (al.getNotaB() > maiorNota) maiorNota = al.getNotaB();
            if (al.getNotaB() < menorNota) maiorNota = al.getNotaB();
        }
        System.out.println("MÉDIAS: ");
        double somaGeral = 0;
        for (Aluno al : alunos){
            somaGeral += al.getNotaA();
            somaGeral += al.getNotaB();
        }
        int qtdeNotas = alunos.size() * 2;
        double mediaGeral = somaGeral / qtdeNotas;
        System.out.printf("Média geral: %.2f%n", mediaGeral);
        System.out.printf("Maior média: %.2f%n", maiorMedia);
        System.out.printf("Menor média: %.2f%n", menorMedia);
        System.out.printf("Menor nota: %.2f%n", menorNota);
        System.out.printf("Maior nota: %.2f%n", maiorNota);
    }
}
