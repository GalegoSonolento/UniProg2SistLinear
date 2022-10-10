package associacoesEHerancaTest;

import associacoesEHEranca.Cone;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeTest {
    private static Cone co;

    @BeforeAll
    public static void inicializaConeDoTeste(){
        co = new Cone("Cone", 2, 5, 4);
    }
    @Test
    public void testaAreaLateralCone(){
        assertEquals(31.4, co.areaLateral(), 2);
    }
    @Test
    public void testaAreaBase(){
        assertEquals(12.56, co.areaCirculo(), 2);
    }
    @Test
    public void testaAreaTotalCone(){
        assertEquals(43.96, co.areaTotal(), 2);
    }
    @Test
    public void testaVolumeCone(){
        assertEquals(16.74, co.volumeCone(), 2);
    }
}
