import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String inside = scanner.next();
        System.out.println(palindromo(""));
        scanner.close();
    }

    public static boolean palindromo(String frase){
        String frase2 = frase.replace(" ", "");
        String[] letras = frase2.split("");
        return ehPalindromo(letras, 0, letras.length-1);
    }

    public static boolean ehPalindromo(String[] letras, int i, int f){
        boolean iguais = letras[i].equalsIgnoreCase(letras[f]);
        return iguais && (f - i <= 2 ? true : ehPalindromo(letras, i+1, f-1));
    }
}
