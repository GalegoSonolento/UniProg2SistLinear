package associacoesEHEranca;

public class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double circunferencia(){
        return 2*Math.PI*raio;
    }
    public double areaCirculo(){
        return Math.PI*Math.pow(raio, 2);
    }
    public double volumeEsferaDaCircunferencia(){
        return (4*Math.pow(raio, 3)*Math.PI)/3;
    }
}
