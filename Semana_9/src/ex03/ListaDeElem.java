package ex03;

import java.util.ArrayList;

public class ListaDeElem {
    private ArrayList<Elem> elems;

    public ListaDeElem() {
        this.elems = new ArrayList<>();
    }

    public ArrayList<Elem> getElems() {
        return elems;
    }

    public ArrayList<Elem> inverteElementos(){
        ArrayList<Elem> invertidos = new ArrayList<>();
        for (int i=0; i< elems.size(); i++){
            invertidos.add(elems.get(elems.size()-1-i));
        }
        elems = invertidos;
        return elems;
    }

    public ArrayList<Elem> tiraTrecho(int com, int fim){
        if (com < 0) com = 0;
        if (fim > elems.size()-1) fim = elems.size()-1;
        for (int i=0; i< elems.size(); i++){
            if (i >= com && i <= fim){
                elems.set(i, null);
            }
        }
        return elems;
    }
}
