package mainTest;

import main.FilaDeEspera;
import main.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.element.PackageElement;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilaDeEsperaTest {
    private FilaDeEspera arrLFila;
    @BeforeEach
    public void inicializaFila(){
        arrLFila = new FilaDeEspera();
    }
    /*
    Nesse caso ainda precisa quebrar esse teste e ver o que está acontecendo de erro nele
     */
    @Test
    public void testaAdicionarFilaTrue(){
        Paciente pa = new Paciente("Roberto", 20);
        Paciente pa1 = new Paciente("Carlos", 30);
        Paciente pa2 = new Paciente("Carolina", 15);
        Paciente pa3 = new Paciente("Robertinha", 50);
        assertTrue(arrLFila.adicionaNaFila(pa));
        assertTrue(arrLFila.adicionaNaFila(pa1));
        assertTrue(arrLFila.adicionaNaFila(pa2));
        assertTrue(arrLFila.adicionaNaFila(pa3));
    }
    @Test
    public void testaAdicionaFilaFalse(){
        Paciente pa = new Paciente("Roberto", -20);
        Paciente pa1 = new Paciente("   ", 30);
        assertFalse(arrLFila.adicionaNaFila(pa));
        assertFalse(arrLFila.adicionaNaFila(pa1));
    }
}
