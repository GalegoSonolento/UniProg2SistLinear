package ex03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaElemTest {
    @Test
    public void testaInversao(){
        Elem e1 = new Elem("Grtrudes", 20);
        Elem e2 = new Elem("Donival", 12);
        Elem e3 = new Elem("Petrúcio", 60);
        ListaDeElem lista1 = new ListaDeElem();
        ArrayList<Elem> lista2 = new ArrayList<>();
        lista1.getElems().add(e1);
        lista1.getElems().add(e2);
        lista1.getElems().add(e3);
        for (Elem elem : lista1.getElems()) System.out.println(elem);
        lista2.add(e3);
        lista2.add(e2);
        lista2.add(e1);
        System.out.println("---------------------------=");
        for (Elem elem : lista2) System.out.println(elem);
        assertEquals(lista2, lista1.inverteElementos());
        System.out.println("Lista 1 invertida: ");
        for (Elem elem : lista1.getElems()) System.out.println(elem);
    }
}
