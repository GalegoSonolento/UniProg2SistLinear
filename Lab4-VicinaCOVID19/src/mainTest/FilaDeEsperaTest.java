package mainTest;

import main.FilaDeEspera;
import main.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class FilaDeEsperaTest {
    private FilaDeEspera arrLFila;
    private Paciente pa, pa1, pa2, pa3;

    @BeforeEach
    public void inicializaFila(){
        arrLFila = new FilaDeEspera();
        pa = new Paciente("Roberto", 20);
        pa1 = new Paciente("Carlos", 30);
        pa2 = new Paciente("Carolina", 15);
        pa3 = new Paciente("Robertinha", 50);
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
        assertEquals("""
                Lista de espera para vacina:\s
                 - Robertinha, 50
                 - Roberto, 20
                """, arrLFila.filaDePacientes());
    }
    @Test
    public void testaOrdemFilaComTres(){
        arrLFila.adicionaNaFila(pa2);
        arrLFila.adicionaNaFila(pa1);
        arrLFila.adicionaNaFila(pa);
        assertEquals("""
                Lista de espera para vacina:\s
                 - Carlos, 30
                 - Roberto, 20
                 - Carolina, 15
                """, arrLFila.filaDePacientes());
    }
    @Test
    public void testaRetirarCerto(){
        arrLFila.adicionaNaFila(pa2);
        arrLFila.adicionaNaFila(pa1);
        arrLFila.adicionaNaFila(pa);
        System.out.println(arrLFila.filaDePacientes());
        assertTrue(arrLFila.retiraDaFilaDeEspera(pa1));
        System.out.println(arrLFila.filaDePacientes());
    }
    @Test
    public void testaRetirarPacientePosAleatoriaDaFila(){
        arrLFila.adicionaNaFila(pa2);
        arrLFila.adicionaNaFila(pa1);
        arrLFila.adicionaNaFila(pa);
        System.out.println(arrLFila.filaDePacientes());
        assertFalse(arrLFila.retiraDaFilaDeEspera(pa2));
        System.out.println(arrLFila.filaDePacientes());
    }
}
