package associacoesEHerancaTest;

import associacoesEHEranca.Quadrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadradoTest {
    private static Quadrado qua;

    @BeforeAll
    public static void iniciaQuadrado(){
        qua = new Quadrado("Quadrado", 4);
    }
    @Test
    public void testaArea(){
        assertEquals(16, qua.areaQuadrado(), 2);
    }
}
