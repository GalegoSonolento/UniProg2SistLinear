package classesAbstratasPolimorfismoInterfaces.ex02.automotores.utilitarios;

import Exer2.automotores.Veiculo;

public class Manobrista {
    private String nome;
    private int idade;
    private Veiculo veiculo;

    public Manobrista(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
