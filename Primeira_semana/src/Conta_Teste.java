public class Conta_Teste {
    public static void main(String [] args){
        Conta c1 = new Conta("Jorginho");
        c1.depositar(1000);
        System.out.println(c1.toString());
        c1.sacar(500);
        System.out.println(c1.toString());
    }
}
