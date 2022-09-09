package mainEgenerico;

import Tips.F;
import Tips.S;

public class Main {
    public static void main(String[] args){
        S sus = new S();
        F amongus = new F();
        S sus2 = new S();
        F amongus2 = new F();
        Par<String> teste = new Par<String>(sus, amongus);
        System.out.println(teste.getSus());
        System.out.println(teste.getAmongus());
        teste.setSus(sus2);
        teste.setAmongus(amongus2);
    }
}
