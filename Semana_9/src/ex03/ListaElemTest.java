package ex03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaElemTest {
    private Elem e1, e2, e3, e4;
    private ListaDeElem lista1;
    private ArrayList<Elem> lista2, lista3;
    private ArrayList<Elem> lista4;

    @BeforeEach
    public void inicializaTestes(){
        e1 = new Elem("Grtrudes", 20);
        e2 = new Elem("Donival", 12);
        e3 = new Elem("Petrúcio", 60);
        e4 = new Elem("Donival", 55);
        lista1 = new ListaDeElem();
        lista2 = new ArrayList<>();
        lista1.getElems().add(e1);
        lista1.getElems().add(e2);
        lista1.getElems().add(e3);
        lista1.getElems().add(e4);
        //for (Elem elem : lista1.getElems()) System.out.println(elem);
        lista2.add(e4);
        lista2.add(e3);
        lista2.add(e2);
        lista2.add(e1);
        System.out.println("---------------------------=");
        //for (Elem elem : lista2) System.out.println(elem);
        lista3 = new ArrayList<>();
        lista3.add(e1);
        lista3.add(null);
        lista3.add(null);
        lista3.add(null);
        lista4 = new ArrayList<>();
        lista4.add(e1);
        lista4.add(null);
        lista4.add(null);
        lista4.add(e4);
    }
    @Test
    public void testaInversao(){
        assertEquals(lista2, lista1.inverteElementos());
        System.out.println("Lista 1 invertida: ");
        for (Elem elem : lista1.getElems()) System.out.println(elem);
    }
    @Test
    public void testaTiraTrecho(){
        assertEquals(lista3, lista1.tiraTrecho(1, 5));
    }
    @Test
    public void testaTiraMeio(){
        assertEquals(lista4, lista1.tiraTrecho(1, 2));
    }
}
