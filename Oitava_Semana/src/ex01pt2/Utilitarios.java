package ex01pt2;

import java.util.ArrayList;

public class Utilitarios {
    public double meidaGeral(ArrayList<Alunos> llist){
        double somaTotal = 0;
        for (Alunos al : llist){
            somaTotal += al.getNotaA() + al.getNotaB();
        }
        return somaTotal / llist.size();
    }

    public double menorMedia(ArrayList<Alunos> list){
        double menorMedia = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                menorMedia = list.get(i).getMedia();
            else if (menorMedia > list.get(i).getMedia())
                menorMedia = list.get(i).getMedia();
        }
        return menorMedia;
    }

    public double maiorMedia(ArrayList<Alunos> list){
        double maiorMedia = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                maiorMedia = list.get(i).getMedia();
            else if (maiorMedia < list.get(i).getMedia())
                maiorMedia = list.get(i).getMedia();
        }
        return maiorMedia;
    }

    public double menorNota(ArrayList<Alunos> list){
        double menorNota = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                menorNota = list.get(i).getMedia();
            else if (menorNota > list.get(i).getNotaA() || menorNota > list.get(i).getNotaB())
                menorNota = list.get(i).getMedia();
        }
        return menorNota;
    }
}
