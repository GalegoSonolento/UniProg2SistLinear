package exer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class exer1_2 {
    public static void main(String[] args){

        String path = "C:\\Users\\henri\\Documentos\\in.txt";

        //Classe padrão para ler um streaming de dados
        FileReader fr = null;
        // Criado pra gerenciar a memória da leitura
        // Primeiro intencia o file reader como referência, depois coloca o buffered em cima do file reader -> leitura otimizada
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            // Uma leitura linha a linha é o jeito mais prático


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
