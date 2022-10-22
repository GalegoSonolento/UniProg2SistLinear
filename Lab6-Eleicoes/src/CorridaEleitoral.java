import java.util.ArrayList;

public class CorridaEleitoral {
    private ArrayList<Politico> candidatos;

    public CorridaEleitoral() {
        candidatos = new ArrayList<>();
    }

    public String mostraCandidatos(){
        if (candidatos.isEmpty()) return "Não existem canditados";
        String retorno = "Lista dos candidatos: "+"\n";
        for (int i=0; i<candidatos.size(); i++){
            retorno += candidatos.get(i).toString() + "\n";
        }
        return retorno;
    }
}
