package associacoesEHEranca;

public class Cone extends Figura{
    private double raioDaBase;
    private double geratriz;
    private double altura;

    public Cone(String nome, double raioDaBase, double geratriz, double altura) {
        super(nome);
        this.raioDaBase = raioDaBase;
        this.geratriz = geratriz;
        this.altura = altura;
    }

    public double areaLateral() {
        return Math.PI*raioDaBase*geratriz;
    }
    public double areaCirculo(){
        return Math.PI*Math.pow(raioDaBase, 2);
    }

    public double areaTotal() {
        return this.areaLateral() + this.areaCirculo();
    }

    public double volumeCone() {
        return (this.areaCirculo()*altura)/3;
    }
}
