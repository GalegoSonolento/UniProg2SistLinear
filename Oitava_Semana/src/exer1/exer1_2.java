package exer1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class exer1_2 {
    public static void main(String[] args){

        String path = "C:\\Users\\henri\\Documents\\in.txt";
        //String path = "C:\\Users\\Henrique Haag\\Documents\\in.txt";

        //Classe padrão para ler um streaming de dados
        FileReader fr = null;
        // Criado pra gerenciar a memória da leitura
        // Primeiro intencia o file reader como referência, depois coloca o buffered em cima do file reader -> leitura otimizada
        BufferedReader br = null;

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            // Uma leitura linha a linha é o jeito mais prático

            String line = br.readLine();
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try{
                br.close(); // O ato de fechar ambos esses recursos pode gerar uma exceção no código
                fr.close();
            }
            catch (IOException e){
                e.printStackTrace();    //Imprime na tela todo o stacktrace dos erros e ajuda a tratar na hora que der algum problema
            }
        }
    }
}
