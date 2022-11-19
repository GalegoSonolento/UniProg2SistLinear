public class Politico{
    private String nome, partido;
    private int idade, qtdeVotos;

    public Politico(String nome, int idade, int qtdeVotos, String partido) {
        this.nome = nome;
        this.idade = idade;
        this.qtdeVotos = qtdeVotos;
        this.partido = partido;
    }

    @Override
    public String toString() {
        return nome+", "+idade+" anos"+" -> "+qtdeVotos+" votos";
    }

    public int getIdade() {
        return idade;
    }

    public int getQtdeVotos() {
        return qtdeVotos;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
