package ex4;

public class Aluno {
    private String nome;
    private int idade;
    private double nota;
    private String situacao;

    public Aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setSituacao(String situacao){
        this.situacao = situacao;
    }

    public String getSituacao(){
        return situacao;
    }
}
