package ex01.implementacao;
import java.util.ArrayList;

public class Implementacoes {
    private ArrayList<String> arrLi;

    public Implementacoes() {
        arrLi = new ArrayList<>();
    }

    public ArrayList<String> getArrLi() {
        return arrLi;
    }

    public void setArrLi(ArrayList<String> arrLi) {
        this.arrLi = arrLi;
    }

    public String imprimirColecao(){
        String retorno = "";
        for (String str : arrLi){
            retorno = retorno + str + " ";
        }
        return retorno;
    }

}
