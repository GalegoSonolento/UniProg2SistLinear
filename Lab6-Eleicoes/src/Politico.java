public class Politico implements Comparable<Politico>{
    private String nome;
    private int idade, qtdeVotos;

    public Politico(String nome, int idade, int qtdeVotos) {
        this.nome = nome;
        this.idade = idade;
        this.qtdeVotos = qtdeVotos;
    }

    @Override
    public String toString() {
        return nome+", "+idade+" anos"+" -> "+qtdeVotos+" votos";
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Politico outroPolitico) {
        if (this.idade > outroPolitico.getIdade()) return 1;
        if (this.idade < outroPolitico.getIdade()) return -1;
        return 0;
    }
}
