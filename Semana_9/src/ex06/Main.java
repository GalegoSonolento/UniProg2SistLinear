//Faça um programa que gerencie as notas de 10 alunos. A classe Aluno deve conter o nome do aluno e a
//        notas de grau A, grau B. Crie uma classe Disciplina que manipulará um ArrayList de alunos. O programa
//        deve exibir o nome e a nota dos alunos, bem como sua média (usem média aritmética para calculá-la). Ao
//final, além da exibição, programa deve emitir a média geral da turma, a menor nota, a maior nota, a menor
//        média e a maior média.
//        Exemplo:
//        Estudante A B Média
//        Guilherme 8 10 9
//        Joao 10 6 8
//        ....
//        MEDIAS
//        Media geral: 8.5
//        Menor media: 5.4
//        Maior media: 9
//        Menor nota: 3
//        Maior nota: 10

package ex06;

public class Main {
    public static void main(String[] args){
        Disciplina ds = new Disciplina();

        Aluno al1 = new Aluno("Jorge", 10, 5);
        Aluno al2 = new Aluno("Jorgina", 8, 9);
        Aluno al3 = new Aluno("samuel", 5.5, 7);
        Aluno al4 = new Aluno("Petrolina", 8.2, 2);

        ds.getAlunos().add(al1);
        ds.getAlunos().add(al2);
        ds.getAlunos().add(al3);
        ds.getAlunos().add(al4);

        ds.exibeNotas();
        ds.exibeMedias();



    }
}
