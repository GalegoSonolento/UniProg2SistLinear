package Exer2;

import Exer2.automotores.Veiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        Veiculo[] veiculos = new Veiculo[quant];
        for (int i=0; i< veiculos.length; i++){
            double velocidade = scanner.nextDouble();
            int passageiros = scanner.nextInt();
            int sorteio = (int)(Math.random()*3+1);
            System.out.println(sorteio);
        }
    }
}
