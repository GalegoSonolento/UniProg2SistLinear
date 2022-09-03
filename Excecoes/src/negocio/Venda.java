package negocio;

import negocio.exceptions.ClienteInvalidoException;

public class Venda {

    public boolean realiza(Cliente c, Vendedor j) {
        if (c.getIdade() < 18){
            //throw new ClienteInvalidoException("Cliente é um menó, pae");
            return false;
        }
        return true;
    }
}
