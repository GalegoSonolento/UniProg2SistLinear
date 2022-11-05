import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CorridaEleitoralTest {
    // Preiso consertar os roblemas relacionados com o sort dentro do código
    private CorridaEleitoral ce;
    private Politico pl1, pl2, pl3;
    @BeforeEach
    public void inicializaElementos(){
        ce = new CorridaEleitoral();
        pl1 = new Politico("Celso", 50, 200);
        pl2 = new Politico("Portiole", 60, 1000);
        pl3 = new Politico("Robertina", 23, 400);
        ce.getCandidatos().add(pl1);
        ce.getCandidatos().add(pl2);
        ce.getCandidatos().add(pl3);
    }
    @Test
    public void testaMostragemDeCandidatosComGente(){
        System.out.println(ce.mostraCandidatosSemOrdem());
        assertEquals("""
                Lista dos candidatos:\s
                Celso, 50 anos -> 200 votos
                Portiole, 60 anos -> 1000 votos
                Robertina, 23 anos -> 400 votos
                """, ce.mostraCandidatosSemOrdem());
    }
    @Test
    public void testaCandidatoMaisNovo(){
        assertEquals(pl3, ce.mostraCandidatoMaisNovo());
    }
    @Test
    public void testaCandidatoMaisVelho(){
        assertEquals(pl2, ce.mostraCandidatoMaisVelho());
    }
    @Test
    public void testaCandidatoMaisVotado(){
        assertEquals(pl2, ce.mostraCandidatoMaisVotado());
    }
    @Test
    public void testaCandidatoMenosVotado(){
        assertEquals(pl1, ce.mostraCandidatoMenosVotado());
    }
    @Test
    public void testaTotalDeVotosCandidatos(){
        assertEquals(1600, ce.totalDeVotosDosCanditados());
    }
    @Test
    public void testaMediaDosVotosCandidatos(){
        assertEquals(533.33, ce.mediaDosVotosDosCandidatos(), 2);
    }
    @Test
    public void testaErroNaMediaDosVotosDeCandidatos(){
        CorridaEleitoral ce2 = new CorridaEleitoral();
        assertEquals(-1, ce2.mediaDosVotosDosCandidatos());
    }
}
