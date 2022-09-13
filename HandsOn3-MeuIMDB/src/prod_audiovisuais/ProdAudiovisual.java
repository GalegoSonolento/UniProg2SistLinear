package prod_audiovisuais;

public abstract class ProdAudiovisual {
    private String codigo;
    private String nome;
    private int ano;
    private String diretor;
    private String atores;
    private String genero;

    public ProdAudiovisual(String codigo, String nome, int ano, String diretor, String atores, String genero) {
        this.codigo = codigo;
        this.nome = nome;
        this.ano = ano;
        this.diretor = diretor;
        this.atores = atores;
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getAtores() {
        return atores;
    }

    public void setAtores(String atores) {
        this.atores = atores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
