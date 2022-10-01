package Exer1;

import java.util.Scanner;

public class ArrayTeste {
    Scanner scanner = new Scanner(System.in);
    int quant = scanner.nextInt();
    private Cliente[] clientes = new Cliente[quant];

    public void arrayTeste(){
        for (int i=0; i< clientes.length; i++){
            scanner.nextLine();
            String nome = scanner.next();
            String cpf = scanner.next();
            String endereco = scanner.next();
            String telefone = scanner.next();
            String email = scanner.next();
            try{
                 clientes[i] = new Cliente(nome, cpf, endereco, telefone, email);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
        arrayshow(clientes);
    }

    public void arrayshow(Cliente[] cl){
        for(int i=0; i<cl.length; i++){
            System.out.println(cl[i]);
        }
    }
}
