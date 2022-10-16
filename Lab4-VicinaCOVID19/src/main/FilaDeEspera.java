package main;

import java.util.ArrayList;

public class FilaDeEspera {
    private ArrayList<Paciente> arrLPaciente;

    public FilaDeEspera() {
        arrLPaciente = new ArrayList<>();
    }

    public boolean adicionaNaFila(Paciente pa){
        pa.setNome(pa.getNome().strip());
        if (pa.getNome().equals("") || pa.getIdade() < 0)
            return false;
        adicionaNaOrdem(pa);
//        arrLPaciente.add(pa);
        return arrLPaciente.contains(pa);
    }

    public void adicionaNaOrdem(Paciente pa){
        if (arrLPaciente.isEmpty())
            arrLPaciente.add(pa);
        else if (arrLPaciente.size() == 1)
            if (arrLPaciente.get(0).getIdade() > pa.getIdade()) arrLPaciente.add(pa);
            else arrLPaciente.add(0, pa);
        else{
            for (int i=0; i<arrLPaciente.size(); i++){
                if (arrLPaciente.get(i).getIdade() > pa.getIdade() && arrLPaciente.get(i+1).getIdade() < pa.getIdade())
                    arrLPaciente.add(i+1, pa);
                else arrLPaciente.add(pa);
            }
        }
    }
}
