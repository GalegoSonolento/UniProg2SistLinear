package main;

import java.util.ArrayList;

public class FilaDeEspera {
    private ArrayList<Paciente> arrLPaciente;

    public FilaDeEspera() {
        arrLPaciente = new ArrayList<>();
    }

    public ArrayList<Paciente> getArrLPaciente() {
        return arrLPaciente;
    }

    public boolean adicionaNaFila(Paciente pa){
        pa.setNome(pa.getNome().strip());
        if (pa.getNome().equals("") || pa.getIdade() < 0)
            return false;
        adicionaNaOrdem(pa);
        return arrLPaciente.contains(pa);
    }
    public String filaDePacientes(){
        String retorno = "Lista de espera para vacina: "+"\n";
        for (Paciente paciente : arrLPaciente) retorno = retorno + paciente.toString() + "\n";
        return retorno;
    }

    public boolean retiraDaFilaDeEspera(Paciente pa){
        if (verificarSePaExisteEEstaNaPrimPos(pa)){
            arrLPaciente.remove(pa);
            return true;
        }
        return false;
    }
    private boolean verificarSePaExisteEEstaNaPrimPos(Paciente pa){
        return arrLPaciente.contains(pa) && arrLPaciente.get(0) == pa;
    }

    private void adicionaNaOrdem(Paciente pa){
        if (arrLPaciente.isEmpty())
            arrLPaciente.add(pa);
        else if (testePosicaoSegundoPaciente(pa)) arrLPaciente.add(0, pa);
        else if (meioOuFimDaFila(pa)) arrLPaciente.add(pa);
    }
    private boolean testePosicaoSegundoPaciente(Paciente pa){
        if (arrLPaciente.size() == 1)
            return !segundoPacienteMaisNovo(pa);
        return false;
    }
    private boolean segundoPacienteMaisNovo(Paciente pa){
        if (arrLPaciente.get(0).getIdade() > pa.getIdade()){
            arrLPaciente.add(pa);
            return true;
        }
        return false;
    }

    private boolean meioOuFimDaFila(Paciente pa){
        for (int i=0; i<arrLPaciente.size()-1; i++){
            if (arrLPaciente.get(i).getIdade() < pa.getIdade()) {
                arrLPaciente.add(0, pa);
                return false;
            }
            else if (arrLPaciente.get(i).getIdade() > pa.getIdade() && arrLPaciente.get(i +1).getIdade() < pa.getIdade()){
                arrLPaciente.add(i+1, pa);
                return false;
            }
        }
        return true;
    }
}
