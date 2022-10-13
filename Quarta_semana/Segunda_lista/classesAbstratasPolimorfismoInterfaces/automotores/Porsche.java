package classesAbstratasPolimorfismoInterfaces.automotores;

public class Porsche extends Veiculo {
    private int euro = 10000;

    public Porsche(double velocidade, int passageiros) {
        super(velocidade, passageiros);
    }
    public void setEuro(int euro){
        this.euro = euro;
    }
    public int getEuro(){
        return euro;
    }
}
