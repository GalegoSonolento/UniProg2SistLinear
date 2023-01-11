package Ex03;

public class Bubble extends Ordenacoes{
    public Bubble(int tamanhoArray) {
        super(tamanhoArray);
    }
    public void bubbleSort() {
        int fora, dentro;

        for (fora = super.getNumeroElementos() - 1; fora > 1; fora--)
            for (dentro = 0; dentro < fora; dentro++)
                if (super.getArray()[dentro] > super.getArray()[dentro + 1])
                    troca(dentro, dentro + 1);
    }

    private void troca(int elemento1, int elemento2) {
        long temp = super.getArray()[elemento1];
        super.getArray()[elemento1] = super.getArray()[elemento2];
        super.getArray()[elemento2] = temp;
    }
}
