package Exer1.Exceptions;

public class ClienteInvalidoException extends RuntimeException{
    public ClienteInvalidoException(String mensagem){
        super(mensagem);
    }
}
