package ex04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAPILinkedList {
    private APILinkedList linked;
    private ElementosLinkedList l1;
    private ElementosLinkedList l2, l3, l4;
    @BeforeEach
    public void montaAmbiente(){
        linked = new APILinkedList();
        l1 = new ElementosLinkedList(22);
        l2 = new ElementosLinkedList(13);
        l3 = new ElementosLinkedList(45);
        l4 = new ElementosLinkedList(30);
    }
    @Test
    public void testaInserirUltimaPos(){
        assertEquals(0, linked.inserirNaListaUltPos(l1));
    }
    @Test
    public void testaUltimaPosComAlguem(){
        linked.inserirNaListaUltPos(l1);
        assertEquals(1, linked.inserirNaListaUltPos(l2));
    }
    @Test
    public void testeiterandoTodosOsElementosDeUmaLinkedList(){
        linked.inserirNaListaUltPos(l1);
        linked.inserirNaListaUltPos(l2);
        linked.inserirNaListaUltPos(l3);
        assertTrue(linked.iterandoTodosOsElementosDeUmaLinkedList());
    }
    @Test
    public void testeIterandoAPartirdePos(){
        linked.inserirNaListaUltPos(l1);
        linked.inserirNaListaUltPos(l2);
        linked.inserirNaListaUltPos(l3);
        assertTrue(linked.iterandoAPartirDePos(2));
    }
    @Test
    public void testeIterandoAPartirdePosFalse(){
        linked.inserirNaListaUltPos(l1);
        linked.inserirNaListaUltPos(l2);
        linked.inserirNaListaUltPos(l3);
        assertFalse(linked.iterandoAPartirDePos(6));
    }
    @Test
    public void testeIteraInverso(){
        linked.inserirNaListaUltPos(l1);
        linked.inserirNaListaUltPos(l2);
        linked.inserirNaListaUltPos(l3);
        linked.inserirNaListaUltPos(l4);
        assertTrue(linked.iterandoNaOrdemInversa());
    }
}
