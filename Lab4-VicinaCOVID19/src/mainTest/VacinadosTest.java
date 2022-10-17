package mainTest;

import main.Paciente;
import main.Vacinados;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VacinadosTest {
    private Vacinados arrLVacinados;
    private Paciente pa, pa1, pa2, pa3, pa4;

    @BeforeEach
    public void inicializaTestes(){
        arrLVacinados = new Vacinados();
        pa = new Paciente("Roberto", 20);
        pa1 = new Paciente("Carlos", 30);
        pa2 = new Paciente("Carolina", 15);
        pa3 = new Paciente("Robertinha", 50);
        pa4 = new Paciente("Jorginho", 17);
    }
    @Test
    public void testaAdicionarNosVacinados(){
        assertTrue(arrLVacinados.adicionaNaListaDeVacinados(pa));
    }
    @Test
    public void testaAdicionarNosVacinadosFalse(){
        Paciente pa5 = new Paciente("   ", 23);
        Paciente pa6 = new Paciente("Alemão", -34);
        assertFalse(arrLVacinados.adicionaNaListaDeVacinados(pa5));
        assertFalse(arrLVacinados.adicionaNaListaDeVacinados(pa6));
    }
    @Test
    public void testaFilaDeVacinados(){
        arrLVacinados.adicionaNaListaDeVacinados(pa1);
        arrLVacinados.adicionaNaListaDeVacinados(pa2);
        arrLVacinados.adicionaNaListaDeVacinados(pa3);
        assertEquals("Lista de pacientes já vacinados: "+"\n"+" - Carlos, 30"+"\n"+" - Carolina, 15"+"\n"+
                " - Robertinha, 50"+"\n", arrLVacinados.filaDeVacinados());
    }
}
