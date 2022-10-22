public class Politico {
    private String nome;
    private int idade, qtdeVotos;

    public Politico(String nome, int idade, int qtdeVotos) {
        this.nome = nome;
        this.idade = idade;
        this.qtdeVotos = qtdeVotos;
    }

    @Override
    public String toString() {
        return nome+", "+idade+" anos"+" -> "+qtdeVotos+" votos";
    }
}
