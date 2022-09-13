package streamings;

import lista.Lista;

public class AmazonPrime implements Streaming{
    private Lista<String> categoria;

    public AmazonPrime(){
        categoria = new Lista<>();
        categoria.adiciona(0, "FimDeSemana");
    }

    @Override
    public Lista<String> getCategoria() {
        return categoria;
    }

    @Override
    public StreamingId getId() {
        return StreamingId.AMAZON_PRIME;
    }
}
