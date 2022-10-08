package associacoesEHerancaTest;

import associacoesEHEranca.Circulo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CirculoTest {
    private static Circulo c;
    @BeforeAll
    public static void inicializaCirculoDeTeste(){
        c = new Circulo(2);
    }
    @Test
    public void testaCircunferencia(){
        assertEquals(12.56, c.circunferencia(), 2);
    }
    @Test
    public void testaAreaCirculo(){
        assertEquals(12.56, c.areaCirculo(), 2);
    }
    @Test
    public void testaVolumeDaEsferaDaCircunferencia(){
        assertEquals(33.49, c.volumeEsferaDaCircunferencia(), 2);
    }
}
