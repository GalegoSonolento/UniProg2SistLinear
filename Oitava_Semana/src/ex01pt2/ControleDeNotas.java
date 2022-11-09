package ex01pt2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ControleDeNotas {
    public static void main(String[] args){ // Parece que não funcionou a leitura de td
        Utilitarios ut = new Utilitarios();
        String path = "/home/haaghenrique/Documentos/testesParaAula/notas.txt";

        ArrayList<Alunos> alunos = new ArrayList<>();
        String header = "";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            header = line;
            line = bf.readLine();

            while (line != null){
                String[] linha = line.split(",");
                String name = linha[0];
                double notaA = Double.parseDouble(linha[1]);
                double notaB = Double.parseDouble(linha[2]);
                double media = Double.parseDouble(linha[3]);
                Alunos al = new Alunos(name, notaA, notaB, media);
                alunos.add(al);
                line = bf.readLine();
            }

//            for (Alunos aluno : alunos) {
//                System.out.println(aluno);
//            }

        }catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        System.out.println(ut.display(alunos));
    }
}
