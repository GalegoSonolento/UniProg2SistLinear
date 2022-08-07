public class Circulo {
    private int raio;
    private Ponto origem;

    public Circulo(int raio, Ponto origem) {
        this.raio = raio;
        this.origem = origem;
    }

    public double area(){
        return Math.PI * Math.pow(raio, 2);
    }

    public double circunferencia(){
        return 2 * (Math.PI * raio);
    }

    public Circulo(int raio, int x, int y) {
        this.raio = raio;
        this.origem = new Ponto(x, y);
    }
}
