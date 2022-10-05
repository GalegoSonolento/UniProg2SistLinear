package Exer2.utilitarios;

import Exer1.Cliente;
import Exer1.Exceptions.ClienteInvalidoException;

public class Validacao {
//    public void numPassageiros();

    public void numPassageiros(Cliente c1) throws ClienteInvalidoException {
        if (c1.getNome().length() < 3 || c1.getCpf().length() < 12){
            throw new ClienteInvalidoException("Nome ou cpf inválido");
        }
    }
}
