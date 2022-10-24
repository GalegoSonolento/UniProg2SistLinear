import java.util.ArrayList;
import java.util.Collections;

public class CorridaEleitoral {
    private ArrayList<Politico> candidatos, candidaatosSorted;

    public CorridaEleitoral() {
        candidatos = new ArrayList<>();
    }

    public ArrayList<Politico> getCandidatos() {
        return candidatos;
    }

    public String mostraCandidatosSemOrdem(){
        if (candidatos.isEmpty()) return "Não existem canditados";
        String retorno = "Lista dos candidatos: "+"\n";
        for (Politico candidato : candidatos) {
            retorno += candidato.toString() + "\n";
        }
        return retorno;
    }
    private String transfereListaParaString(ArrayList<Politico> pl){
        if (pl.isEmpty()) return "Não existem canditados";
        String retorno = "Lista dos candidatos: "+"\n";
        for (Politico politico : pl) {
            retorno += politico.toString() + "\n";
        }
        return retorno;
    }

    public String ordenaCandidatosPorIdade(){
        candidaatosSorted = candidatos;
        Collections.sort(candidaatosSorted);
        return transfereListaParaString(candidaatosSorted);
    }
}
