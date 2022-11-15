package ex03;

public class Elem {
    private String nome;
    private int idade;

    public Elem(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Elem{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
