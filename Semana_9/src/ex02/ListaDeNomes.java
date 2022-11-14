package ex02;

import java.util.ArrayList;
import java.util.Collections;

public class ListaDeNomes {
    private ArrayList<String> nomes;

    public ListaDeNomes(){
        this.nomes = new ArrayList<>();
    }

    public ArrayList<String> getNomes() {
        return nomes;
    }

    public boolean removeTerceiroElem(){
        if (nomes.size() >= 3) {
            nomes.remove(2);
            return true;
        }
        return false;
    }

    public String pesquisarNome(String n){
        int resp = nomes.indexOf(n);
        if (resp != -1) return "O nome " + n + " está na posição " + resp;
        return "Nome não encontrado";
    }

    public ArrayList<String> ordenarColecao(){
        Collections.sort(nomes);
        return nomes;
    }

    public ArrayList<String> copiaLista(){
        ArrayList<String> nomesCopy = nomes;
        return nomesCopy;
//        return Collections.copy(nomes);
    }
}
