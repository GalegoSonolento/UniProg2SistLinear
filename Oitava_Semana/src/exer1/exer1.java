package exer1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exer1 {
    public static void main(String[] args){

        File file = new File("C:\\Users\\henri\\Documents\\in.txt"); // Está apontando pro arquivo do pc
        Scanner sc = null;  // A variável do Scanner precisa de escopo -> Depois de abrir um Scanner é sempre bom fechá-lo, para evitar vazamento de memória
        try{
            sc = new Scanner(file);  // Scanner tbm é usado pra ler dados da entrada padrão e lê arquivos
            while (sc.hasNextLine()){   // Torna verdadeiro se o arquivo ainda tem uma linha abaixo
                String line = sc.nextLine(); // Agora o sistema está devidamente lendo a linha e guardando na memória
                System.out.println(line);
            }
        }
        catch (IOException e){  // Esse tipo de tratamento já engloba falta de acesso para o arquivo e outras coisas a mais, pode-se dizer que é mais genérico - outro fato interessante é que também é possível usar FileNotFoundException nesse caso, mas seu escopo é mais limitado
            System.out.println(e.getMessage()); // Imprime na tela essa exceção, mas não quebra o sistema
        }
        finally {   // Muito interessante para fechar os recursos abertos no código - ele vai executar não importando quem roda (o try ou o catch)
            if (sc != null)
                sc.close();
        }
    }
}
