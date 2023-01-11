package Ex03;

public class Ordenacoes {
    private long[] array;
    private int numeroElementos;

    public Ordenacoes(int tamanhoArray) {
        array = new long[tamanhoArray];
        numeroElementos = 0;
    }

    public void insere(long valor) {
        array[numeroElementos] = valor;
        numeroElementos++;
    }

    public void mostra() {
        for (int j = 0; j < numeroElementos; j++)
            System.out.print(array[j] + " ");
        System.out.println();
    }

    public long[] getArray() {
        return array;
    }

    public int getNumeroElementos() {
        return numeroElementos;
    }
}
