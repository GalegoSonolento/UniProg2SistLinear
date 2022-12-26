import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex01 {
    static Queue<String> cores = new LinkedList<>();
    public static void main(String[] args) {

        System.out.println("Bem vindo ao programa muito doido das filas!");
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Selecione sua opção!");
            System.out.println("1 - Inserir elemento;" +
                    "\n2 - Remover elemento;" +
                    "\n3 - Imprimir a fila;" +
                    "\n4 - Ver tamanho da fila;" +
                    "\n5 - Sair");
            int opcao = 0;
            while (true){
                System.out.println("Qual sua escolha: ");
                String escolha = scanner.next();
                try{
                    opcao = Integer.parseInt(escolha);
                    break;
                } catch (Exception e){
                    System.out.println("ERRO! Apenas números inteiros são válidos!");
                }
            }
            if (opcao == 1){
                System.out.println("Digite a cor para incluir na fila: ");
                String cor = scanner.next();
                cores.add(cor);
                System.out.println("Cor inserida!");
            }
            else if(opcao == 2){
                System.out.println("Digite a cor para excluir da fila: ");
                String cor = scanner.next();
                if (cores.contains(cor)){
                    cores.remove(cor);
                    System.out.println("Cor removida!");
                }
                else System.out.println("A cor não está na fila.");
            }
            else if (opcao == 3){
                System.out.println("Toda a fila: ");
                for (String s : cores) System.out.println(" - " + s);
            }
            else if (opcao == 4){
                int tamFila = cores.size();
                System.out.println("O tamanho atual da fila é: " + tamFila);
            }
            else if (opcao == 5){
                System.out.println("Tenha um bom dia!");
                scanner.close();
                break;
            }
            else System.out.println("Opção inválida!");
        }while (true);




    }
}