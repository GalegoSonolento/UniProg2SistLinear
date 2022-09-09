package Exercicio_4.mainEgenerico;

import Tipos.Aluno;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Integer[] n = {1, 2, 3, 4, 5};

        generico<Integer> test = new generico<Integer>(10, n);
        System.out.println(Arrays.toString(test.getT()));

        Aluno[] al = new Aluno[2];
        for (int i=0; i< al.length; i++){
            al[i] = new Aluno("Roberto ou Carlos");
        }
        generico<Aluno> sus = new generico<Aluno>(2, al);
        System.out.println(Arrays.toString(sus.getT()));
    }
}
