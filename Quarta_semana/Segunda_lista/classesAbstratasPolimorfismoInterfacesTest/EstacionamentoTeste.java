package classesAbstratasPolimorfismoInterfacesTest;

import Exer2.Manobrista;
import Exer2.automotores.Veiculo;
import classesAbstratasPolimorfismoInterfaces.automotores.LandRover;
import classesAbstratasPolimorfismoInterfaces.automotores.Porsche;
import classesAbstratasPolimorfismoInterfaces.automotores.Yamaha;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstacionamentoTeste {
    private Manobrista manobrista;
    private Veiculo lr;
    private Veiculo pr;
    private Veiculo ym;
    @BeforeEach
    public void criaManobrista(){
        lr = new Veiculo(0, 1);
        pr = new Veiculo(0, 0);
        ym = new Veiculo(0, 0);
        Veiculo[] teste = {lr, pr, ym};
        manobrista  = new Manobrista("Cléber", teste[(int)(Math.random()*3)]);
    }
    @Test
    public void testeAcelera(){
        manobrista.getVeiculo().setVelocidade(100);
        assertEquals(100, manobrista.getVeiculo().getVelocidade());
    }
}
