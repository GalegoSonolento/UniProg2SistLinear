package Ex03;

public class Insert extends Ordenacoes{
    public Insert(int tamanhoArray) {
        super(tamanhoArray);
    }

    public void insertionSort() {
        int dentro, fora;

        for (fora = 1; fora < super.getNumeroElementos(); fora++) {
            long temp = super.getArray()[fora];
            dentro = fora;
            while (dentro > 0 && super.getArray()[dentro - 1] >= temp) {
                super.getArray()[dentro] = super.getArray()[dentro - 1];
                --dentro;
            }
            super.getArray()[dentro] = temp;
        }
    }
}
