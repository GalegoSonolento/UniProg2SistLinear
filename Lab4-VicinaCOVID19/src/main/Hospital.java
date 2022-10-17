package main;

public class Hospital {
    /*
    Essa classe vai intermediar as relações entre a fila de espera e os já vacinados
    É ela que vai averiguar se o paciente realmente existe na fila de espera e vai colocá-lo na lista de vacinados
     */
    private FilaDeEspera arrLFila;
    private Vacinados arrLVacinados;

    public Hospital() {
        arrLFila = new FilaDeEspera();
        arrLVacinados = new Vacinados();
    }

    public FilaDeEspera getArrLFila() {
        return arrLFila;
    }

    public Vacinados getArrLVacinados() {
        return arrLVacinados;
    }

    private boolean colocaNosVacinados(Paciente pa){
        if (arrLFila.retiraDaFilaDeEspera(pa)){
            arrLVacinados.adicionaNaListaDeVacinados(pa);
            return true;
        }
        return false;
    }

    public boolean colocaOprimeiroNosVacinados(){
        return colocaNosVacinados(arrLFila.getArrLPaciente().get(0));
    }
}
