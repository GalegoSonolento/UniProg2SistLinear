package ex4;

public class ValidaNota {

    public String situacaoAluno(Aluno a){
        if (a.getNota() < 5) {
            a.setSituacao("reprovação");
            return a.getSituacao();
        }
        else if (a.getNota() >= 7){
            a.setSituacao("aprovado");
            return a.getSituacao();
        }
        a.setSituacao("exame");
        return a.getSituacao();
    }
}
