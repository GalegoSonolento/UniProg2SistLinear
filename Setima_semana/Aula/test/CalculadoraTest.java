import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    private static Calculadora c;

    @BeforeAll
    public static void inicializa(){
        c = new Calculadora();
    }
    @Test
    public void testa2Mais2Igual4(){
        assertEquals(4, c.soma(2, 2));
    }
    @Test
    public void testa2Mais3Igual5(){
        assertEquals(5, c.soma(2, 3));
    }
    @Test
    public void testa2Menos2Igual0(){
        assertEquals(0, c.subtracao(2, 2));
    }
    @Test
    public void testa2Menos4IgualMenos2(){
        assertEquals(-2, c.subtracao(2, 4));
    }
    @Test
    public void testa2Vezes8igual16(){
        assertEquals(16, c.multiplicacao(2, 8));
    }
    @Test
    public void testaMenos2Vezes4IgualMenos8(){
        assertEquals(-8, c.multiplicacao(-2, 4));
    }
    @Test
    public void testa2Divide4Igual2(){
        assertEquals(2, c.divide(4, 2));
    }
    @Test
    public void testa2Divide5Igual2Ponto5(){
        assertEquals(2.5, c.divide(5,2));
    }
}
