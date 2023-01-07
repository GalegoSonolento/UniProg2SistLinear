/*
1. Escreva um programa que implemente uma pilha. Este programa deve permitir que você inclua produtos
        (formato String). Faça algumas operações como imprimir a fila, inserir elementos, remover elementos, ver
        tamanho da pilha.
*/

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> pilha_teste = new Stack<>();

        do{
            System.out.println("Bem vindo ao programa muito louco de pilhas!");
            System.out.println("Funções: ");
            System.out.println("1 - Incluir produtos;");
            System.out.println("2 - Imprimir a fila;");
            System.out.println("3 - Remover elementos;");
            System.out.println("4 - Ver tamanho da pilha;");
            System.out.println("5 - Sair");
            System.out.println("Qual sua escolha (apenas números): ");
            int opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.println("Escreva o novo produto a ser inserido!");
                String produto = scanner.next();
                pilha_teste.add(produto);
                System.out.println("Produto colocado!");
            }
            else if (opcao == 2){
                System.out.println("-=-=-=-=-=-=-=-=-=-=");
                System.out.println(pilha_teste);
                System.out.println("-=-=-=-=-=-=-=-=-=-=");
            }
            else if (opcao == 3){
                System.out.println("Removendo o 1° elemento da fila...");
                pilha_teste.pop();
                System.out.println("Elemento removido");
            }
            else if (opcao == 4){
                System.out.println("O tamanho da pilha é: ");
                System.out.println(pilha_teste.size());
            }
            else if (opcao == 5){
                System.out.println("Saindo do programa...");
                break;
            }
            else System.out.println("Opção inválida");
        }while (true);
    }
}