import java.util.Scanner;

public class Potencia {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = potencia(sc.nextInt(), sc.nextInt());
        System.out.println(result);
    }

    public static int potencia(int base, int expoente){
        int n = base;
        int l = expoente;
        if (l == 0) return 1;
        else {
            return n * potencia(n, l-1);
        }
    }
}
