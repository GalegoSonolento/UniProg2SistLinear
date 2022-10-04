package Exer1;

import java.util.Scanner;

public class ArrayTeste{
    public boolean preenchimentoCorreto(Cliente c1){
        if (c1.getNome().length() < 3 || c1.getCpf().length() < 12){
            System.out.println("Preenchimento incorreto!");
            return false;
        }
        return true;
    }
}
