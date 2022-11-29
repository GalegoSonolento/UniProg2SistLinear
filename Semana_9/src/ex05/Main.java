package ex05;

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

        System.out.println(strings);

        System.out.println("Trocar dois elementos de lugar");
        String first = strings.getFirst();
        String last = strings.getLast();
        int index = strings.indexOf(last);
        strings.set(0, last);
        strings.set(index, first);

        System.out.println(strings);
        System.out.println();
        System.out.println("=-=-=-=-=-=-==-=-=-=-=");
        System.out.println();
        System.out.println("Misturar elementos");

    }
}
