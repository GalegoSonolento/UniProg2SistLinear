package ex02;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Meme> memes = new ArrayList<>();

        String path = "/home/haaghenrique/Documentos/temp/ex02.txt";

        String header = "";

        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
            String line = bf.readLine();
            if (line != null)  header = line;
            line = bf.readLine();
            while (line != null){
                String[] linha = line.split(",");
                String nome = linha[0];
                int ano = Integer.parseInt(linha[1]);
                memes.add(new Meme(nome, ano));
                line = bf.readLine();
            }

            for (Meme m1 : memes){
                if (m1 != null) System.out.println(m1);
            }

        } catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }
        System.out.println("CSV completamente lido e listas preenchidas");
        Meme m2 = new Meme("Poker Face", 2012);
        Meme m3 = new Meme("Véio da Havan", 2018);
        Meme m4 = new Meme("Vin Diesel brasileiro", 2016);
        Meme m5 = new Meme("Cara no Parabrisa do Caminhão", 2022);

        memes.add(m2);
        memes.add(m3);
        memes.add(m4);
        memes.add(m5);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            if (header.equalsIgnoreCase("")) header = "Nome,Idade";
            bw.write(header);
            bw.newLine();
            for (Meme m : memes){
                bw.write(String.valueOf(m));
                bw.newLine();
            }
        } catch (IOException e){
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
