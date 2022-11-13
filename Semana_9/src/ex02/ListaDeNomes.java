package ex02;

import java.util.ArrayList;

public class ListaDeNomes {
    private ArrayList<String> nomes;

    public ListaDeNomes(){
        this.nomes = new ArrayList<>();
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
        if (resp != -1) return "O nome " + n + "está na posição " + resp;
        return "Nome não encontrado";
    }
}
