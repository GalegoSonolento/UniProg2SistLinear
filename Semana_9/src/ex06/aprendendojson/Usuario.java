package ex06.aprendendojson;

import java.io.Serializable;

public class Usuario implements Serializable {

    private String login;
    private String senha;
    private String cpf;

    public Usuario(String login, String senha, String cpf) {
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
