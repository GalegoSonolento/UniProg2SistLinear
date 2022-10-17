package mainTest;

import main.FilaDeEspera;
import main.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.element.PackageElement;

import static org.junit.jupiter.api.Assertions.*;

public class FilaDeEsperaTest {
    private FilaDeEspera arrLFila;
    private Paciente pa, pa1, pa2, pa3, pa4;

    @BeforeEach
    public void inicializaFila(){
        arrLFila = new FilaDeEspera();
        pa = new Paciente("Roberto", 20);
        pa1 = new Paciente("Carlos", 30);
        pa2 = new Paciente("Carolina", 15);
        pa3 = new Paciente("Robertinha", 50);
        pa4 = new Paciente("Jorginho", 17);
    }
    /*
    Nesse caso ainda precisa quebrar esse teste e ver o que está acontecendo de erro nele
     */
    @Test
    public void testaAdicionarFilaTrue(){
        assertTrue(arrLFila.adicionaNaFila(pa));
    }
    @Test
    public void testeAdicionaDoisNaFila(){
        assertTrue(arrLFila.adicionaNaFila(pa));
        assertTrue(arrLFila.adicionaNaFila(pa));
    }
    @Test
    public void testaAdicionaTresNaFila(){
        assertTrue(arrLFila.adicionaNaFila(pa2));
        assertTrue(arrLFila.adicionaNaFila(pa1));
        assertTrue(arrLFila.adicionaNaFila(pa));
    }
    @Test
    public void testaAdicionaFilaFalse(){
        Paciente pa = new Paciente("Roberto", -20);
        Paciente pa1 = new Paciente("   ", 30);
        assertFalse(arrLFila.adicionaNaFila(pa));
        assertFalse(arrLFila.adicionaNaFila(pa1));
    }
    @Test
    public void testaOrdemFilaComDois(){
        arrLFila.adicionaNaFila(pa);
        arrLFila.adicionaNaFila(pa3);
        assertEquals("Lista de espera para vacina: "+
                "\n"+" - Robertinha, 50"+"\n"+" - Roberto, 20"+"\n", arrLFila.filaDePacientes());
    }
    @Test
    public void testaOrdemFilaComTres(){
        arrLFila.adicionaNaFila(pa2);
        arrLFila.adicionaNaFila(pa1);
        arrLFila.adicionaNaFila(pa);
        assertEquals("Lista de espera para vacina: "+"\n"+" - Carlos, 30"+"\n"+" - Roberto, 20"+
                "\n"+" - Carolina, 15"+"\n", arrLFila.filaDePacientes());
    }
}
