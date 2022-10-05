package Exer1;

import Exer1.Exceptions.ClienteInvalidoException;

import java.util.Scanner;

public class ArrayException {
    public static void main(String[] args){
        ArrayTeste at = new ArrayTeste();
        Scanner scanner = new Scanner(System.in);
        int quant = scanner.nextInt();
        scanner.nextLine();
        Cliente[] clientes = new Cliente[quant];
        System.out.println(quant);
        for (int i=0; i<clientes.length; i++) {
            String nome = scanner.next();
            String cpf = scanner.next();
            String endereco = scanner.next();
            String telefone = scanner.next();
            String email = scanner.next();
            Cliente c1 = new Cliente(nome, cpf, endereco, telefone, email);
            try{
                at.preenchimentoCorreto(c1);
                clientes[i] = c1;
            }catch (ClienteInvalidoException e){
                i--;
//                System.out.println("Cliente "+c1+" inválido");
                System.out.println(e.getMessage());
            }
//            at.preenchimentoCorreto(c1);
//            if (!at.preenchimentoCorreto(c1)) break;

//            System.out.println(clientes[i]);
//            scanner.nextLine();
        }
        System.out.println("=-=-=-=-=-=-");
        for (int i=0; i< clientes.length; i++){
            System.out.println(clientes[i]);
        }

    }
}
