package associacoesEHEranca;

public class Quadrado extends Figura{
    private double aresta;

    public Quadrado(String nome, double aresta) {
        super(nome);
        this.aresta = aresta;
    }

    public Double areaQuadrado() {
        return Math.pow(aresta, 2);
    }
}
