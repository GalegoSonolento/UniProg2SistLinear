public class ImpressaoRecusiva {
    public static void main(String[] args){
        int[] inteiros = {12, 234, 23, 89, 56, 45, 2};
        printRecusivo(inteiros, 0);
    }

    public static void printRecusivo(int[] ints, int i){
        if (i == ints.length - 1)
            System.out.print(ints[i]+" ");
        else {
            System.out.print(ints[i]+" ");
            printRecusivo(ints, i+1);
        }
    }
}
