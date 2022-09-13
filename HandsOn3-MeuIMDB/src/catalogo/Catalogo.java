package catalogo;

import lista.Lista;
import prod_audiovisuais.ProdAudiovisual;
import streamings.Streaming;
import streamings.StreamingId;

public class Catalogo {
    private ProdAudiovisual producao;
    private Streaming streaming;
    private Lista<String> categorias;

    public Catalogo(ProdAudiovisual producao, Streaming streaming, Lista<String> categorias) {
        this.producao = producao;
        this.streaming = streaming;
        this.categorias = categorias;
    }

//    public void objeto(){
//        System.out.println(producao);
//        System.out.println(streaming);
//        System.out.println(categorias);
//    }
}
