package classesAbstratasPolimorfismoInterfaces.automotores;

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

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getPassageiros() {
        return passageiros;
    }

    public void setPassageiros(int passageiros) {
        this.passageiros = passageiros;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "velocidade=" + velocidade +
                ", passageiros=" + passageiros +
                '}';
    }
}
