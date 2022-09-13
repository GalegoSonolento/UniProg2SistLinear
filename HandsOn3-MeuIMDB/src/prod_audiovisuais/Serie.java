package prod_audiovisuais;

public class Serie extends ProdAudiovisual{
    private int quantTemp;
    private int quantEpTemp;

    public Serie(String codigo, String nome, int ano, String diretor, String atores, String genero, int quantTemp, int quantEpTemp) {
        super(codigo, nome, ano, diretor, atores, genero);
        this.quantTemp = quantTemp;
        this.quantEpTemp = quantEpTemp;
    }

    public int getQuantTemp() {
        return quantTemp;
    }

    public void setQuantTemp(int quantTemp) {
        this.quantTemp = quantTemp;
    }

    public int getQuantEpTemp() {
        return quantEpTemp;
    }

    public void setQuantEpTemp(int quantEpTemp) {
        this.quantEpTemp = quantEpTemp;
    }
}
