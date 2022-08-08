import java.util.Scanner;

public class Carro {
    public static void main(String[] args){
        Scanner preco = new Scanner(System.in);
//        String str;
//        System.out.println("Mensagem de teste: ");
//        str = teste.nextLine();
//        System.out.println("Sucesso - escrita: " + str);
//
//        System.out.println("Mete o preço do carro aí: ");
//        int numero = teste.nextInt();
//        System.out.println("Preço de fábrica do carro: " + numero);
        System.out.println("Digite o preço de fábrica do veículo: ");
        double precoCarro = preco.nextDouble();
        System.out.println("O preço total do carro é: " + precoCarro(precoCarro));

        preco.close();
    }

    public static double precoCarro(double a){
        double custoDeCompra = a * 0.20;
        double impostos = a * 0.45;
        double publicidade = a * 0.08;
        return a + custoDeCompra + impostos + publicidade;
    }
}
