package exer1;

import exer1.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class exer1_3 {
    public static void main(String[] args){

//        String path = "C:\\Users\\henri\\Documents\\in.txt";
        String path = "/home/haaghenrique/Documentos/temp/in.txt";

        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){ // Quando termina o block try e cai no catch, os recursos de leitura serão automaticamente finalizados

            String line = br.readLine();
            line = br.readLine();   // O primeiro readLine() vai ler o cabeçalho do CSV, essa segunda vai tentar ler o produto mesmo, caso ela seja nula, nem entra no while e economiza recurso da máquina
            while (line != null){

                String[] vect = line.split(",");    // Uma split simples com base nas vírgulas do CSV
                String name = vect[0];
                double price = Double.parseDouble(vect[1]);
                Integer qte = Integer.parseInt(vect[2]);

                Product prod = new Product(name, price, qte);
                list.add(prod);

                line = br.readLine();
            }

            System.out.println("PRODUCTS:");
            for (Product p : list){
                System.out.println(p);
            }
        } catch (IOException e){ // O bloco finally não é mais necessário
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}
