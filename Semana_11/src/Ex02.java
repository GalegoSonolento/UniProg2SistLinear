import java.util.Deque;
import java.util.LinkedList;

public class Ex02 {
    public static void main(String[] args){
        DequeGenerica<Armazenada> dg = new DequeGenerica<>();
        Armazenada a1 = new Armazenada("5462484256", 2022);
        Armazenada a2 = new Armazenada("54684245625", 2002);
        Armazenada a3 = new Armazenada("79878415", 1991);
        Armazenada a4 = new Armazenada("213546871", 2014);

        dg.getDequeT().add(a1);
        dg.getDequeT().add(a2);
        dg.getDequeT().add(a3);
        dg.getDequeT().add(a4);

        System.out.println("=-=-=-=-=-");
        System.out.println("Deque atual: ");
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Inserção no início do deque: ");
        Armazenada a5 = new Armazenada("2482465213", 1899);
        dg.getDequeT().addFirst(a5);
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Inserção no fim da fila: ");
        Armazenada a6 = new Armazenada("2480354305", 2020);
        dg.getDequeT().addLast(a6);
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Remoção no começo da fila: ");
        dg.getDequeT().pollFirst();
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Remoção do final da fila: ");
        dg.getDequeT().pollLast();
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Recuperando o elemento do início sem tirar da fila: ");
        Armazenada a7 = dg.getDequeT().getFirst();
        System.out.println(a7);
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Recuperando o elemento do final sem perdê-lo");
        Armazenada a8 = dg.getDequeT().getLast();
        System.out.println(a8);
        System.out.println(dg.getDequeT());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
    }


}


class DequeGenerica<T>{
    private T t;
    private Deque<T> dequeT = new LinkedList<>();

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Deque<T> getDequeT() {
        return dequeT;
    }

    public void setDequeT(Deque<T> dequeT) {
        this.dequeT = dequeT;
    }
}

class Armazenada{
    private String serialNumber;
    private int anoFab;

    public Armazenada(String serialNumber, int anoFab) {
        this.serialNumber = serialNumber;
        this.anoFab = anoFab;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    @Override
    public String toString() {
        return "Armazenada{" +
                "serialNumber='" + serialNumber + '\'' +
                ", anoFab=" + anoFab +
                '}';
    }
}
