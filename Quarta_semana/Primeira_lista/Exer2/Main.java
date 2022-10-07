package Exer2;

import Exer2.Excecoes.NumPassageirosException;
import Exer2.automotores.LandRover;
import Exer2.automotores.Porsche;
import Exer2.automotores.Veiculo;
import Exer2.automotores.Yamaha;
import Exer2.utilitarios.Validacao;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Main {
    private static Validacao va = new Validacao();
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        Veiculo[] veiculos = new Veiculo[quant];
        for (int i=0; i< veiculos.length; i++){
            double velocidade = scanner.nextDouble();
            int passageiros = scanner.nextInt();
            int sorteio = (int)(Math.random()*3+1);
            if (sorteio == 1){
                Veiculo lr = new LandRover(velocidade, passageiros);
                try{
                    va.numPassageirosEVelocidade(lr);
                    veiculos[i] = lr;
                }catch (NumPassageirosException e){
                    System.out.println(e.getMessage());
                    i--;
                }
            }
            else if (sorteio == 2){
                Veiculo pr = new Porsche(velocidade, passageiros);
                try{
                    va.numPassageirosEVelocidade(pr);
                    veiculos[i] = pr;
                }catch (NumPassageirosException e){
                    System.out.println(e.getMessage());
                    i--;
                }
            }
            else if (sorteio == 3){
                Veiculo ym = new Yamaha(velocidade, passageiros);
                try{
                    va.numPassageirosEVelocidade(ym);
                    veiculos[i] = ym;
                }catch (NumPassageirosException e){
                    System.out.println(e.getMessage());
                    i--;
                }
            }
        }

        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
        }
    }
}
