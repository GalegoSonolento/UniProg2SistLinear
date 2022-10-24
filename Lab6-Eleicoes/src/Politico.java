public class Politico implements Comparable<Politico>{
    private String nome;
    private int idade, qtdeVotos;

    public Politico(String nome, int idade, int qtdeVotos) {
        this.nome = nome;
        this.idade = idade;
        this.qtdeVotos = qtdeVotos;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        return nome+", "+idade+" anos"+" -> "+qtdeVotos+" votos";
    }

    @Override
    public int compareTo(Politico outroPolitico) {
        if (this.idade > outroPolitico.getIdade()) return 1;
        if (this.idade < outroPolitico.getIdade()) return -1;
        return 0;
    }
}
