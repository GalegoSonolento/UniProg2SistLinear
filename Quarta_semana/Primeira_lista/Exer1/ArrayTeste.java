package Exer1;

import Exer1.Exceptions.ClienteInvalidoException;

import java.util.Scanner;

public class ArrayTeste{
    public boolean preenchimentoCorreto(Cliente c1){
        if (c1.getNome().length() < 3 || c1.getCpf().length() < 12){
            throw new ClienteInvalidoException("Nome ou cpf inválido");
        }
        return true;
    }
}
