package main;

import java.util.ArrayList;

public class Vacinados {
    private ArrayList<Paciente> arrLVacinados;

    public Vacinados() {
        arrLVacinados = new ArrayList<>();
    }
    public boolean adicionaNaListaDeVacinados(Paciente pa){
        pa.setNome(pa.getNome().strip());
        if (pa.getNome().equals("") || pa.getIdade() < 0) return false;
        arrLVacinados.add(pa);
        return true;
    }
    public String filaDeVacinados(){
        String retorno = "Lista de pacientes já vacinados: "+"\n";
        for (Paciente paciente : arrLVacinados) retorno = retorno + paciente.toString() + "\n";
        return retorno;
    }
}
