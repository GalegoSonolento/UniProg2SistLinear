package ex06;

import java.util.ArrayList;

public class Disciplina {
    private ArrayList<Aluno> alunos;

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
        String input = "Estudante: ";
        System.out.printf("%s\t %s\t %s\t %s\n", "Estudante: ", "A", "B", "Média");
        for (Aluno al : alunos){
            System.out.println();
        }
    }
}
