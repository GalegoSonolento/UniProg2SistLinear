package Exer2.utilitarios;

import Exer1.Cliente;
import Exer1.Exceptions.ClienteInvalidoException;
import Exer2.Excecoes.NumPassageirosException;
import Exer2.automotores.LandRover;
import Exer2.automotores.Veiculo;

public class Validacao {
    public void numPassageirosEVelocidade(Veiculo v1) throws NumPassageirosException {
        if (v1.getVelocidade() > 110 || v1.getPassageiros() > 5){
            throw new NumPassageirosException("Velocidade ou número de passageiros acima do limite");
        }
    }
}
