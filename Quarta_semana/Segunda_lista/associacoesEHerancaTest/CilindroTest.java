package associacoesEHerancaTest;

import associacoesEHEranca.Cilindro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CilindroTest {
    private Cilindro cl, cl2;

    @BeforeEach
    public void iniciaCilindro(){
        cl = new Cilindro("Cilindro", 2, 5);
        cl2 = new Cilindro("Cilindro Falso", -2, 8);
    }
    @Test
    public void cilindroVerdadeiro(){
        assertTrue(cl.testeCilindroReal());
    }
    @Test
    public void testeCilindroFalso(){
        assertFalse(cl2.testeCilindroReal());
    }
    @Test
    public void testeAreaCilindro(){
        assertEquals(87.92, cl.areaCilindro(), 2);
    }
    @Test
    public void testeAreaLateralCilindro(){
        assertEquals(62.8, cl.areaLateralCilindro(), 1);
    }
    @Test
    public void testeVolumeCilindro(){
        assertEquals(62.8, cl.volumeCilindro(), 1);
    }
}
