package exer1;

import exer1.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class exer1_4 {
    public static void main(String[] args) throws IOException {

//        String path = "C:\\Users\\henri\\Documents\\in.txt";
        String path = "/home/haaghenrique/Documentos/temp/teste..txt";

        ArrayList<Product> prod = new ArrayList<>();
        String header = "";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // Quando termina o block try e cai no catch, os recursos de leitura serão automaticamente finalizados

            String line = br.readLine();
            header = line;
            line = br.readLine();
            while (line != null){
                String[] teste = line.split(",");
                String name = teste[0];
                double price = Double.parseDouble(teste[1]);
                Integer qte = Integer.parseInt(teste[2]);
                Product p1 = new Product(name, price, qte);
                prod.add(p1);
                line = br.readLine();
            }
            for (Product pr : prod){
                System.out.println(pr);
            }
        } catch (IOException e){ // O bloco finally não é mais necessário
            System.out.println("ERRO: " + e.getMessage());
        }

        Product p2 = new Product("ChromeCast", 200, 50);
        prod.add(p2);
        Product p3 = new Product("Copo de borracha", 59.90, 3);
        prod.add(p3);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            bw.write(header);
            for (Product pd : prod){
                bw.newLine();
                String name = pd.getName();
                String price = String.valueOf(pd.getPrice());
                String qte = String.valueOf(pd.getQuantity());
                bw.write(name + "," + price + "," + qte);
            }
        }catch (IOException e){
            System.out.println("ERRO: "+e.getMessage());
        }
    }
}

