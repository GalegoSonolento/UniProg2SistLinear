import java.util.ArrayList;
import java.util.Collections;

public class CorridaEleitoral {
    private ArrayList<Politico> candidatos;

    public CorridaEleitoral() {
        candidatos = new ArrayList<>();
    }

    public ArrayList<Politico> getCandidatos() {
        return candidatos;
    }

    public String mostraCandidatosSemOrdem(){
        if (candidatos.isEmpty()) return "Não existem canditados";
        StringBuilder retorno = new StringBuilder("Lista dos candidatos: " + "\n");
        for (Politico candidato : candidatos) {
            retorno.append(candidato.toString()).append("\n");
        }
        return retorno.toString();
    }

    public Politico mostraCandidatoMaisNovo(){
        Politico maisNovo = null;
        for (Politico pl : candidatos)
            if (pl != null)
                if (maisNovo == null) maisNovo = pl;
                else if (maisNovo.getIdade() > pl.getIdade()) maisNovo = pl;
        return maisNovo;
    }

    public Politico mostraCandidatoMaisVelho() {
        Politico maisvelho = null;
        for (Politico pl : candidatos)
            if (pl != null)
                if (maisvelho == null) maisvelho = pl;
                else if (maisvelho.getIdade() < pl.getIdade()) maisvelho = pl;
        return maisvelho;
    }

    public Politico mostraCandidatoMaisVotado() {
        Politico maisVotado = null;
        for (Politico pl : candidatos)
            if (pl != null)
                if (maisVotado == null) maisVotado = pl;
                else if (maisVotado.getQtdeVotos() < pl.getQtdeVotos()) maisVotado = pl;
        return maisVotado;
    }

    public Politico mostraCandidatoMenosVotado() {
        Politico menosVotado = null;
        for (Politico pl : candidatos)
            if (pl != null)
                if (menosVotado == null) menosVotado = pl;
                else if (menosVotado.getQtdeVotos() > pl.getQtdeVotos()) menosVotado = pl;
        return menosVotado;
    }

    public Integer totalDeVotosDosCanditados(){
        if (!candidatos.isEmpty()){
            int qtdVotos = 0;
            for (Politico candidato : candidatos) {
                if (candidato != null) {
                    qtdVotos += candidato.getQtdeVotos();
                }
            }
            return qtdVotos;
        }
        return 0;
    }

    public double mediaDosVotosDosCandidatos(){
        if (!candidatos.isEmpty()){
            double somaVotos = 0;
            for (int i=0; i<candidatos.size(); i++){
                if (candidatos.get(i) != null){
                    somaVotos += candidatos.get(i).getQtdeVotos();
                }
            }
            return somaVotos / candidatos.size();
        }
        return -1;
    }
}
