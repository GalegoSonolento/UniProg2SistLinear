package ex02;

public class Meme {
    private String nome;
    private int ano;

    public Meme(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return nome+","+ano;
    }
}
