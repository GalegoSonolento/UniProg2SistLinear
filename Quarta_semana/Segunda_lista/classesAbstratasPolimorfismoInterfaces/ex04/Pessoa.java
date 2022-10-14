package classesAbstratasPolimorfismoInterfaces.ex04;

import classesAbstratasPolimorfismoInterfaces.ex04.interfaces.Cidadao;
import classesAbstratasPolimorfismoInterfaces.ex04.interfaces.Contribuinte;
import classesAbstratasPolimorfismoInterfaces.ex04.interfaces.Empregado;
import classesAbstratasPolimorfismoInterfaces.ex04.interfaces.Professor;

public class Pessoa implements Cidadao, Contribuinte, Empregado, Professor {

    @Override
    public void vota() {

    }

    @Override
    public int getRG() {
        return 0;
    }

    @Override
    public boolean pagarIR() {
        return false;
    }

    @Override
    public String getCPF() {
        return null;
    }

    @Override
    public void trabalha() {

    }

    @Override
    public void ensina() {

    }
}
