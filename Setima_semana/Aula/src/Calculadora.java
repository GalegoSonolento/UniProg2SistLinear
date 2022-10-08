public class Calculadora {
    public int soma(int i, int j) {
        return i+j;
    }

    public int subtracao(int i, int j) {
        return i-j;
    }

    public int multiplicacao(int i, int j) {
        return i * j;
    }

    public static double divide(double i, double j) {
        double resultado = i / j;
        System.out.printf("%.2f", resultado);
        System.out.println();
        return i / j;
    }

    public static void main(String[] args){
        double divisao = divide(7, 3);
        System.out.println(divisao);
    }
}