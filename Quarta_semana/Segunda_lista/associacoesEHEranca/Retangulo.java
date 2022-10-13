package associacoesEHEranca;

public class Retangulo {
    private double lado1, lado2;

    public Retangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public boolean retanguloReal() {
        // qql retângulo é real
        return true;
    }

    public double calculaPerimetro() {
        return (2*lado1)+(2*lado2);
    }

    public double calculaArea() {
        return lado2 * lado1;
    }
}
