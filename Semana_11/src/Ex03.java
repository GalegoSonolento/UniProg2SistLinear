import java.util.*;

public class Ex03 {
    public static void main(String[] args){
        ArrayList<Aluno> lista = new ArrayList<>();

        Aluno al1 = new Aluno("Jorge", 5.6);
        Aluno al2 = new Aluno("Joana", 8.5);
        Aluno al3 = new Aluno("Cléber", 9);
        Aluno al4 = new Aluno("Petrolina", 2);
        Aluno al5 = new Aluno("Petrúnio", 7.6);
        Aluno al6 = new Aluno("Jandira", 9.1);

        lista.add(al2);
        lista.add(al1);
        lista.add(al4);
        lista.add(al3);
        lista.add(al5);
        lista.add(al6);

        Collections.sort(lista);

        System.out.println(lista);
    }
}

class Aluno implements Comparable<Aluno>{
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    @Override
    public int compareTo(Aluno o) {
        if (this.nota < o.getNota()) return -1;
        else if (this.nota > o.getNota()) return 1;
        return 0;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
