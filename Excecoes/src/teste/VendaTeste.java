package teste;

import negocio.Cliente;
import negocio.Venda;
import negocio.Vendedor;
import negocio.exceptions.ClienteInvalidoException;

public class VendaTeste {
    public static void main(String[] args) {
        Cliente c = new Cliente("Rapaz", 17);
        Vendedor j = new Vendedor("João");

        Venda venda1 = new Venda();
        try {
            venda1.realiza(c, j);
        } catch (ClienteInvalidoException e) {
            System.out.println("ERRO: "+e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
