public class MenorElemRecusivo { // Ainda precisa arrumar esse código
    public static void main(String[] args){
        int[] inteiros = {12, 234, 23, 89, 56, 45, 2};
        System.out.println("O menor da array é: "+menorRecusivo(inteiros, 0, 0));
    }

    public static int menorRecusivo(int[] ints, int menor, int i){
        if (i == 0) menor = ints[i];
        if (i == ints.length - 1) return menor;
        else if (menor > ints[i]){
                menor = ints[i];

            }
        return menorRecusivo(ints, menor, i + 1);
    }
}
