package ex01pt2;

import java.util.ArrayList;

public class Utilitarios {
    private double mediaGeral(ArrayList<Alunos> llist){
        double somaTotal = 0;
        for (Alunos al : llist){
            somaTotal += al.getNotaA() + al.getNotaB();
        }
        return somaTotal / llist.size();
    }

    private double menorMedia(ArrayList<Alunos> list){
        double menorMedia = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                menorMedia = list.get(i).getMedia();
            else if (menorMedia > list.get(i).getMedia())
                menorMedia = list.get(i).getMedia();
        }
        return menorMedia;
    }

    private double maiorMedia(ArrayList<Alunos> list){
        double maiorMedia = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                maiorMedia = list.get(i).getMedia();
            else if (maiorMedia < list.get(i).getMedia())
                maiorMedia = list.get(i).getMedia();
        }
        return maiorMedia;
    }

    private double menorNota(ArrayList<Alunos> list){
        double menorNota = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                menorNota = list.get(i).getMedia();
            else if (menorNota > list.get(i).getNotaA() || menorNota > list.get(i).getNotaB())
                menorNota = list.get(i).getMedia();
        }
        return menorNota;
    }

    private double maiorNota(ArrayList<Alunos> list){
        double maiorNota = 0;
        for (int i=0; i<list.size(); i++){
            if (i == 0)
                maiorNota = list.get(i).getMedia();
            else if (maiorNota < list.get(i).getNotaA() || maiorNota < list.get(i).getNotaB())
                maiorNota = list.get(i).getMedia();
        }
        return maiorNota;
    }

    public String display(ArrayList<Alunos> list){
        String retorno = "MÉDIAS \n";
        retorno += "Média geral: " + mediaGeral(list) + "\n" +
                "Menor média: " + menorMedia(list) + "\n" +
                "Maior média: " + maiorMedia(list) + "\n" +
                "Menor nota: " + menorNota(list) + "\n" +
                "Maior nota: " + maiorNota(list) + "\n";
        return retorno;
    }
}
