package associacoesEHerancaTest;

import associacoesEHEranca.Quadrado;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadradoTest {
    private Quadrado qua;

    @BeforeEach
    public void iniciaQuadrado(){
        qua = new Quadrado("Quadrado", 4);
    }
    @Test
    public void testaArea(){
        assertEquals(16, qua.areaQuadrado(), 2);
    }
}
