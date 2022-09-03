package filmes;

public class Lista {
    Obras[] obras;
    public Lista(int a) {
        obras = new Obras[a];
    }

    public Obras[] getObras() {
        return obras;
    }

    public void setObras(Obras[] obras) {
        this.obras = obras;
    }
}
