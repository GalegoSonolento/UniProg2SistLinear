package ex01.implementacaoTest;

import ex01.implementacao.Implementacoes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class implementacaoTest {
    private Implementacoes arrLi;
    @BeforeEach
    public void inicializa(){
        arrLi = new Implementacoes();
        for (int i=0; i<2; i++){
            int num = i;
            arrLi.getArrLi().add("Num rod "+num+" ");
        }
    }
    @Test
    public void testaImpressao(){
        assertEquals("Num rod 0  Num rod 1  ", arrLi.imprimirColecao());
    }
}
