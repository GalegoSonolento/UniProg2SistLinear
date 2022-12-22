package ex06.aprendendojson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        String path = "./Semana_9/src/ex06/aprendendojson/gson.json";

        Usuario usuario1 = new Usuario("joao", "1234", "312412341234");

        Usuario user2 = new Usuario("alemao", "5678", "67563475456");

        List<Usuario> users = new ArrayList<Usuario>();
        users.add(usuario1);
        users.add(user2);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonUser = gson.toJson(users);

        System.out.println(jsonUser);

        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))){
            br.write(jsonUser);
            System.out.println("Tá escrito");
        } catch (IOException e){
            System.out.println("ERRO " + e.getMessage());
        }

//        try (BufferedReader bf = new BufferedReader(new FileReader(path))){
//            users = bf.read();
//        } catch (IOException e){
//            System.out.println("ERRO " + e.getMessage());
//        }

    }

}
