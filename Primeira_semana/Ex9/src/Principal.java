import javax.swing.*;

public class Principal {
    public static void main(String[] args){
        Ficha[] f1 = new Ficha[Integer.parseInt(JOptionPane.showInputDialog("Quantos armazenar? "))];
        for (int i=0; i< f1.length; i++){
            f1[i] = new Ficha(JOptionPane.showInputDialog("Nome: "), Integer.parseInt(JOptionPane.showInputDialog("Idade: ")), Double.parseDouble(JOptionPane.showInputDialog("Peso: ")), Double.parseDouble(JOptionPane.showInputDialog("Altura: ")));
        }
        for (int i=0; i< f1.length; i++){
            System.out.println(f1[i].toString());
        }
    }
}
