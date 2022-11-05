package exer1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class exer1_3 {
    public static void main(String[] args){

        String path = "C:\\Users\\henri\\Documents\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // Quando termina o block try e cai no catch, os recursos de leitura serão automaticamente finalizados
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e){ // O bloco finally não é mais necessário
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
