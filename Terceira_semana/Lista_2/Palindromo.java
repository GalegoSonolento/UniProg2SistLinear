public class Palindromo {
    public static void main(String[] args){
        palindromo("a bola da loba");
    }

    public static boolean palindromo(String frase){
        String frase2 = frase.replace(" ", "");
        System.out.println(frase2);
        String[] letras = frase2.split("");
        return true;
    }
}
