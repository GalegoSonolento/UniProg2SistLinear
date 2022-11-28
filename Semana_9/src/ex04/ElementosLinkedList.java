package ex04;

public class ElementosLinkedList {
    private int num;
    private ElementosLinkedList proximo;

    public ElementosLinkedList(int num){
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public ElementosLinkedList getProximo() {
        return proximo;
    }

    public void setProximo(ElementosLinkedList proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "ElementosLinkedList{" +
                "num=" + num +
                ", proximo=" + proximo +
                '}';
    }
}
