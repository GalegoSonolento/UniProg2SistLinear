package ex02;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ListaDeNomesTest {
    private ListaDeNomes nomes = new ListaDeNomes();
    @BeforeEach
    public void inicializaTestes(){
        nomes.getNomes().add("Leandro");
        nomes.getNomes().add("Albertina");
    }
    @Test
    public void testaRemovedorDeTerceiroElemTrue(){
        nomes.getNomes().add("Xandira");
        assertTrue(nomes.removeTerceiroElem());
    }
    @Test
    public void testaRemovedorDeTerceiroElemFalse(){
        assertFalse(nomes.removeTerceiroElem());
    }
    @Test
    public void testaPesquisaPorNomeEncontra(){
        assertEquals("O nome Leandro está na posição 0", nomes.pesquisarNome("Leandro"));
    }
    @Test
    public void testaPesquisaPorNomeNaoEncontra(){
        assertEquals("Nome não encontrado", nomes.pesquisarNome("Alemão"));
    }
    @Test
    public void testaSortLista(){
        nomes.getNomes().add("Betina");
        ArrayList<String> nomesTeste = new ArrayList<>();
        nomesTeste.add("Albertina");
        nomesTeste.add("Betina");
        nomesTeste.add("Leandro");
        assertEquals(nomesTeste, nomes.ordenarColecao());
    }
    @Test
    public void testaCopiaDeLista(){
        ArrayList<String> nomesCopia = new ArrayList<>();
        nomesCopia.add("Leandro");
        nomesCopia.add("Albertina");
        assertEquals(nomesCopia, nomes.copiaLista());
    }
}
