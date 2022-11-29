package ex04;

import ex03.Elem;

import javax.swing.text.Element;

import static java.lang.String.valueOf;

public class APILinkedList {
    private ElementosLinkedList first;
    private ElementosLinkedList last;

    public APILinkedList(){
        first = null;
        last = null;
    }

    public Integer inserirNaListaUltPos(ElementosLinkedList obj){
        if (first == null){
            first = obj;
            obj.setProximo(null);
            last = obj;
            return 0;
        }
        ElementosLinkedList index;
        index = first;
        while (true){
            if (index == last){
                index.setProximo(obj);
                last = obj;
                obj.setProximo(null);
                break;
            }
            index = index.getProximo();
        }
        return 1;
    }

    public boolean iterandoTodosOsElementosDeUmaLinkedList(){
        if (first == null) return false;
        System.out.println(first);
        return true;
    }

    public boolean iterandoAPartirDePos(int pos){
        if(first == null) return false;
        int aux = 1;
        ElementosLinkedList index = first;
        while (true){
            if (index == null) return false;
            if (aux == pos){
                System.out.println(index);
                break;
            }
            index = index.getProximo();
            aux ++;
        }
        return true;
    }

    public boolean iterandoNaOrdemInversa(){
        if (first == null) return false;
        StringBuilder printar = new StringBuilder(" ");
        ElementosLinkedList index = first;
        while (index != null) {
            printar.insert(0, valueOf(index.getNum()) + " - ");
            index = index.getProximo();
        }
        System.out.println(printar);
        return true;
    }

    public boolean inserirPriemeiraEUltimaPos(ElementosLinkedList e){
        if (first == null) {
            first = e;
            last = e;
            e.setProximo(null);
            return false;
        }
        ElementosLinkedList index = first;
        first = e;
        e.setProximo(index);
        index = last;
        index.setProximo(e);
        last = e;
        return true;
    }
}
