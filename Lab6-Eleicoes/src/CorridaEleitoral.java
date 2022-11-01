import java.util.ArrayList;

public class CorridaEleitoral  {
    private ArrayList<Politico> candidatos;

    public CorridaEleitoral() {
        candidatos = new ArrayList<>();
    }

    public String mostraCandidatos(){
        if (candidatos.isEmpty()) return "Não existem canditados";
        String retorno = "Lista dos candidatos: "+"\n";
        for (Politico candidato : candidatos) {
            retorno += candidato.toString() + "\n";
        }
        return retorno;
    }

    public Politico candidatoMaisNovo(){
        if (candidatos.isEmpty()) return null;
        Politico maisNovo = null;
        for (Politico candidato : candidatos)
            if (maisNovo == null) maisNovo = candidato;
            else if (maisNovo.getIdade() > candidato.getIdade()) maisNovo = candidato;
        return maisNovo;
    }
}
