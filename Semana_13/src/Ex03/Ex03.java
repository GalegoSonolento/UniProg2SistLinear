package Ex03;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanhoMaximo = 100;
        Ordenacoes array;




        System.out.println("Escolha seu tipo de ordenação: ");
        do{
            int opcao;
            while (true){
                String recebe = scanner.next();
                try{
                    opcao = Integer.parseInt(recebe);
                    break;
                }catch (Exception e){
                    System.out.println("A opção deve ser um número inteiro...");
                    System.out.println("Erro: "+e.getMessage());
                }
            }
            if (opcao == 1) {
                array = new Bubble(tamanhoMaximo);
                colocaDados(array);
                ((Bubble)array).bubbleSort();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n");
                array.mostra();
            }
            else if (opcao == 2) {
                array = new Insert(tamanhoMaximo);
                colocaDados(array);
                ((Insert)array).insertionSort();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n");
                array.mostra();
            }
            else if (opcao == 3) {
                array = new Select(tamanhoMaximo);
                colocaDados(array);
                ((Select)array).selectionSort();
                System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n");
                array.mostra();
            }
            else if (opcao == 4) {
                System.out.println("Você escolheu sair");
                break;
            }
            else System.out.println("Opção inválida! Tente novamente!");
        }while (true);

    }

    public static void colocaDados(Ordenacoes array){
        array.insere(77);
        array.insere(99);
        array.insere(44);
        array.insere(55);
        array.insere(22);
        array.insere(88);
        array.insere(11);
        array.insere(00);
        array.insere(66);
        array.insere(33);
        array.mostra();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-"+"\n");
    }
}
