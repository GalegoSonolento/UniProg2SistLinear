package filmes;

import java.util.Arrays;

public class Obras {
    private String codigo, nome, diretor, tipo;
    private Atores[] atores;
    private int ano;

    public Obras(String codigo, String nome, String diretor, String tipo, Atores[] atores, int ano) {
        this.codigo = codigo;
        this.nome = nome;
        this.diretor = diretor;
        this.tipo = tipo;
        this.atores = atores;
        this.ano = ano;
    }

    public Atores[] getAtores() {
        return atores;
    }

    public void setAtores(Atores[] atores) {
        this.atores = atores;
    }

    @Override
    public String toString() {
        return "Obras{" +
                "codigo='" + codigo + '\'' +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", tipo='" + tipo + '\'' +
                ", atores=" + Arrays.toString(atores) +
                ", ano=" + ano +
                '}';
    }
}
