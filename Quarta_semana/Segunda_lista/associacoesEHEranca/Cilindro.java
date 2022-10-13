package associacoesEHEranca;

public class Cilindro extends Figura{
    private double raioCirculoBase, altura;

    public Cilindro(String nome, double raioCirculoBase, double altura) {
        super(nome);
        this.raioCirculoBase = raioCirculoBase;
        this.altura = altura;
    }

    public boolean testeCilindroReal() {
        return !(raioCirculoBase < 0) && !(altura < 0);
    }
}
