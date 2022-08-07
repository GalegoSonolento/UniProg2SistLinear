public class Tanque {
    public static void main(String[] args){
        System.out.println("O tanque comprado tem " + Math.round(calculaVol() * 1000.0)/1000.0 + " metros cúbicos.");
    }

    public static double calculaVol(){
        double base = Math.PI * Math.pow(1.80, 2);
        return base * 4;
    }
}
