package classesAbstratasPolimorfismoInterfaces.ex02.automotores;

public class LandRover extends Veiculo {
    private int libras = 10000;

    public LandRover(double velocidade, int passageiros) {
        super(velocidade, passageiros);
    }
    public void setLibras(int libras){
        this.libras = libras;
    }
    public int getLibras(){
        return libras;
    }
}
