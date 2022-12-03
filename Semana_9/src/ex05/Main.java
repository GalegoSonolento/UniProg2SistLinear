package ex05;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Primeiro");
        strings.add("Segundo");
        strings.add("Terceiro");
        strings.add("Quarto");
        strings.add("Quinto");
        strings.add("Sexto");
        strings.add("Sétimo");
        LinkedList<String> strings2 = new LinkedList<>();
        strings2.add("Oitavo");
        strings2.add("Nono");
        strings2.add("Décimo");

        System.out.println(strings);

        System.out.println("Trocar dois elementos de lugar");
        System.out.println(Operations.trocarDoisElementosDeLugar(strings));
        System.out.println();
        System.out.println("=-=-=-=-=-=-==-=-=-=-=");
        System.out.println();

        System.out.println("Misturar elementos");
        System.out.println(Operations.misturarElementos(strings));
        System.out.println();
        System.out.println("=-=-=-=-=-=-==-=-=-=-=");
        System.out.println("Juntar duas LinkedLists");
        System.out.print("Segunda lista: ");
        System.out.println(strings2);
        System.out.println("Lista concatenada: ");
        System.out.println(Operations.JuntarDuasLinkedLists(strings, strings2));
    }
}
