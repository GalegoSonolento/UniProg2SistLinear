public class Locadora {
    public static void main(String[] args){
        System.out.println("O aluguel do filme é: " + calculaAluguel(2, 5, 0, 6));
        System.out.println("O aluguel do filme é: " + calculaAluguel(2, 5, 1, 6));
    }

    public static double calculaAluguel(double taxaDia, int diasAluguel, int diasAtraso, double taxaAtraso){
        double aluguelPadrao = taxaDia * diasAluguel;
        double aluguelAtraso = taxaAtraso * diasAtraso;
        return aluguelPadrao + aluguelAtraso;
    }
}
