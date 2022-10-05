package Exer2.automotores;

public class Veiculo {
    private double velocidade;
    private int passageiros;

    public Veiculo(double velocidade, int passageiros) {
        this.velocidade = velocidade;
        this.passageiros = passageiros;
    }

    public void acelerar(double v){
        this.velocidade+=v;
    }
    public void freiar(double v){
        this.velocidade-=v;
    }
}
