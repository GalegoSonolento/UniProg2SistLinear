package Exer2.automotores;

public class Yamaha extends Veiculo{
    private int ienes = 1000000;

    public Yamaha(double velocidade, int passageiros) {
        super(velocidade, passageiros);
    }
    public void setIenes(int ienes){
        this.ienes = ienes;
    }
    public int getIenes(){
        return ienes;
    }
}
