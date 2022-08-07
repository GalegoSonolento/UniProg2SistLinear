import javax.swing.*;

public class Calculos {
    public static void main(String[] args){
        double A = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para A: "));
        double B = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para B: "));
        double C = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para C: "));
        System.out.println("Áreas calculadas: " + "\n" +
                            "Triângulo: " + areaTriangulo(A, B) + "\n" +
                            "Círculo: " + areaCirculo(C) + "\n" +
                            "Trapézio: " + areaTrapezio(A, B, C) + "\n" +
                            "Quadrado: " + areaQuadrado(B) + "\n" +
                            "Retângulo: " + areaRetangulo(A, B) + "\n" +
                            "Cubo: " + areaCubo(C));
    }

    public static double areaTriangulo(double a, double b){
        return (a * b) / 2;
    }
    public static double areaCirculo(double c){
        return Math.PI * Math.pow(c, 2);
    }
    public static double areaTrapezio(double a, double b, double c){
        return ((a + b) * c) / 2;
    }
    public static double areaQuadrado(double b){
        return Math.pow(b, 2);
    }
    public static double areaRetangulo(double a, double b){
        return a * b;
    }
    public static double areaCubo(double c){
        return Math.pow(c, 2) * 6;
    }
}
