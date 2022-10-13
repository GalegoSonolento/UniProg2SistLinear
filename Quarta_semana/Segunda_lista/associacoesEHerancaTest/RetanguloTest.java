package associacoesEHerancaTest;

import associacoesEHEranca.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RetanguloTest {
    private Retangulo r;

    @BeforeEach
    public void criaRetangulo(){
        r = new Retangulo(2.5, 5);
    }
    @Test
    public void retanguloRealValido(){
        assertTrue(r.retanguloReal());
    }
    @Test
    public void testeperimetroRet(){
        assertEquals(15, r.calculaPerimetro(), 2);
    }
    @Test
    public void testeAreaRetangulo(){
        assertEquals(12.5, r.calculaArea(), 1);
    }
}
