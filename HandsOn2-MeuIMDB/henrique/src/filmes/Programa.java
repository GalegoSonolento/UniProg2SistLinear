package filmes;
import javax.swing.*;

public class Programa {
    public static void main(String[] args){
        Lista lista1 = new Lista(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));

        for (int i=0; i<lista1.getObras().length; i++){
            if (lista1.getObras()[i] == null){
                lista1.getObras()[i] = new Obras(JOptionPane.showInputDialog("Código: "), JOptionPane.showInputDialog("Título: "), JOptionPane.showInputDialog("Diretor: "), JOptionPane.showInputDialog("Tipo: "), new Atores[3], Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
                for (int j=0; i<lista1.getObras()[i].getAtores().length; j++){
                    lista1.getObras()[i].getAtores()[j] = new Atores(JOptionPane.showInputDialog("Nome do ator: "));
                }
            }
        }

        for (int i=0; i<lista1.getObras().length; i++){
            System.out.println(lista1.getObras()[i]);
        }
    }
}
