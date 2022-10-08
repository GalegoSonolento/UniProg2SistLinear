package Construtores;

public class Circulo {
    private Ponto origem;
    private double raio;

    public Circulo(int raio){
        this(new Ponto(0, 0), raio);
    }
    public Circulo(){
        this(new Ponto(0, 0), 1);
    }
    public Circulo(Ponto origem, double raio) {
        this.origem = origem;
        this.raio = raio;
    }
    public Circulo(int raio, int x, int y){
        this.origem = new Ponto(x, y);
        this.raio = raio;
    }


    public double areaCirculo(){
        return Math.PI*Math.pow(raio, 2);
    }
    public double circunferencia(){
        return 2*Math.PI*raio;
    }
}
