package prod_audiovisuais;

public class Filme extends ProdAudiovisual{
    private double tempo;

    public Filme(String codigo, String nome, int ano, String diretor, String atores, String genero, double tempo) {
        super(codigo, nome, ano, diretor, atores, genero);
        this.tempo = tempo;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
}
