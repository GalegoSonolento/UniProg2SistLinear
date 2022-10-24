import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorridaEleitoralTest {
    // Preiso consertar os roblemas relacionados com o sort dentro do código
    private CorridaEleitoral ce;
    private Politico pl1, pl2;
    @BeforeEach
    public void inicializaElementos(){
        ce = new CorridaEleitoral();
        Politico pl1 = new Politico("Celso", 50, 200);
        Politico pl2 = new Politico("Portiole", 60, 1000);
    }
    @Test
    public void testaMostragemDeCandidatosComGente(){
        ce.getCandidatos().add(pl1);
        ce.getCandidatos().add(pl2);
        System.out.println(ce.mostraCandidatosSemOrdem());
        assertEquals("""
                Lista dos candidatos:\s
                Celso, 50 anos -> 200 votos
                Portiole, 60 anos -> 1000 votos
                """, ce.mostraCandidatosSemOrdem());
    }
    @Test
    public void testaOrdenarPorIdade(){
        ce.getCandidatos().add(pl2);
        ce.getCandidatos().add(pl1);
        System.out.println(ce.mostraCandidatosSemOrdem());
        assertEquals("""
                Lista dos candidatos:\s
                Celso, 50 -> 200 votos
                Portiole, 60 -> 1000
                """, ce.ordenaCandidatosPorIdade());
    }
}
