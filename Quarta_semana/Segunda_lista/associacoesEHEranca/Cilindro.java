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

    public double areaLateralCilindro(){
        return (2*Math.PI*raioCirculoBase)*altura;
    }

    public double areaCilindro() {
        return (2*Math.PI*raioCirculoBase)*altura + (Math.PI*Math.pow(raioCirculoBase, 2))*2;
    }

    public double volumeCilindro() {
        return (Math.PI*Math.pow(raioCirculoBase, 2))*altura;
    }
}
