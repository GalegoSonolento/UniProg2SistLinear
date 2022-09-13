package lista;

public class Lista<T> {
    private static final int MAXIMO_TAREFAS = 10;
    private T[] lista;
    private int numeroElementos = 0;

    public Lista(){
        this(MAXIMO_TAREFAS);
    }

    @SuppressWarnings("Unchecked")
    public Lista(int tamanhoLista){
        lista = (T[]) new Object[tamanhoLista];
    }

    public boolean adiciona(int posicao, T elemento){
        if (!ehPosicaovalida(posicao))
            return false;

        if (lista[posicao] == null)
            numeroElementos++;
        lista[posicao] = elemento;

        return true;
    }

    public boolean ehPosicaovalida(int posicao){
        return posicao >= 0 && posicao < lista.length;
    }

    public int numeroElementos(){
        return numeroElementos;
    }

    private boolean listaCheia(){
        return numeroElementos == lista.length;
    }

    public boolean existe(T elemento){
        for (int indx=0; indx < lista.length; indx++){
            T t = lista[indx];
            if (t != null && t.equals(elemento))
                return true;
        }
        return false;
    }

    public T pesquisa(int posicao){
        T elemento = null;
        if (ehPosicaovalida(posicao))
            elemento = lista[posicao];

        return elemento;
    }

    public int pesquisa(T elemento){
        int posicao = -1;
        for (int i = 0; i < lista.length; i++){
            T t = lista[i];
            if (t != null && t.equals(elemento)){
                posicao = i;
                break;
            }
        }

        return posicao;
    }

    public boolean remove(int posicao){
        boolean removeu = false;
        if (ehPosicaovalida(posicao) && pesquisa(posicao)!= null){
            lista[posicao] = null;
            removeu = true;
            numeroElementos--;
        }

        return removeu;
    }
}
