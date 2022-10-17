package mainTest;

import main.Hospital;
import main.Paciente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HospitalTest {
    private Hospital hp;
    private Paciente pa, pa1, pa2, pa3, pa4;

    @BeforeEach
    public void inicializaTeste(){
        hp = new Hospital();
        pa = new Paciente("Roberto", 20);
        pa1 = new Paciente("Carlos", 30);
        pa2 = new Paciente("Carolina", 15);
        pa3 = new Paciente("Robertinha", 50);
        pa4 = new Paciente("Jorginho", 17);
    }
    public void inicializaTesteDeFluxo(){
        hp.getArrLFila().adicionaNaFila(pa);
        hp.getArrLFila().adicionaNaFila(pa1);
        hp.getArrLFila().adicionaNaFila(pa2);
        hp.getArrLFila().adicionaNaFila(pa3);
        hp.getArrLFila().adicionaNaFila(pa4);
        System.out.println(hp.getArrLFila().filaDePacientes());
        System.out.println(hp.getArrLVacinados().filaDeVacinados());
    }
    @Test
    public void testaVacinacaoTrue(){
        hp.getArrLFila().adicionaNaFila(pa);
        hp.getArrLFila().adicionaNaFila(pa1);
        //assertTrue(hp.colocaNosVacinados(pa1));
    }
    @Test
    public void testaVacinacaoFalse(){
        hp.getArrLFila().adicionaNaFila(pa);
        hp.getArrLFila().adicionaNaFila(pa1);
        //assertFalse(hp.colocaNosVacinados(pa));
    }
    @Test
    public void testaFluxoDeVacinacao(){
        inicializaTesteDeFluxo();
        hp.colocaOprimeiroNosVacinados();
        System.out.println(hp.getArrLFila().filaDePacientes());
        System.out.println(hp.getArrLVacinados().filaDeVacinados());
    }
    @Test
    public void testaCicloDeVacinacao2(){
        inicializaTesteDeFluxo();
        for (int i=0; i<4; i++){
            hp.colocaOprimeiroNosVacinados();
        }
        System.out.println(hp.getArrLFila().filaDePacientes());
        System.out.println(hp.getArrLVacinados().filaDeVacinados());
    }
}
