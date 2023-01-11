package Ex03;

public class Select extends Ordenacoes{
    public Select(int tamanhoArray) {
        super(tamanhoArray);
    }

    public void selectionSort() {
        int fora, dentro, minimo;

        for (fora = 0; fora < super.getNumeroElementos() - 1; fora++) {
            minimo = fora;
            for (dentro = fora + 1; dentro < super.getNumeroElementos(); dentro++) {
                if (super.getArray()[dentro] < super.getArray()[minimo])
                    minimo = dentro;
            }
            troca(fora, minimo);
        }
    }

    private void troca(int elemento1, int elemento2) {
        long temp = super.getArray()[elemento1];
        super.getArray()[elemento1] = super.getArray()[elemento2];
        super.getArray()[elemento2] = temp;
    }
}
