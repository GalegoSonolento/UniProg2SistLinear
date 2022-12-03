package ex05;

import java.util.Collections;
import java.util.LinkedList;

public class Operations {
    public static LinkedList<String> trocarDoisElementosDeLugar(LinkedList<String> list){
        String first = (String) list.getFirst();
        String last = (String) list.getLast();
        int index = list.indexOf(last);
        list.set(0, last);
        list.set(index, first);
        return list;
    }

    public static LinkedList<String> misturarElementos(LinkedList<String> list){
        Collections.shuffle(list);
        return list;
    }

    public static LinkedList<String> JuntarDuasLinkedLists(LinkedList<String> list, LinkedList<String> list2){
        LinkedList<String> retorno = new LinkedList<>();
        retorno.addAll(list);
        retorno.addAll(list2);
        return retorno;
    }
}
