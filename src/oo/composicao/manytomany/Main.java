package oo.composicao.manytomany;

public class Main {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("João");
        Aluno aluno2 = new Aluno("Maria");
        Aluno aluno3 = new Aluno("José");
        Aluno aluno4 = new Aluno("Pedro");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Typeorm");
        Curso curso3 = new Curso("Docker");


        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);
        curso2.adicionarAluno(aluno2);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);
        aluno4.adicionarCurso(curso3);

        for (Aluno aluno: curso1.alunos) {
            System.out.println("\nAlunos do curso 1");
            System.out.println(aluno.nome);
        }

        for (Aluno aluno: curso2.alunos) {
            System.out.println("\nAlunos do curso 2");
            System.out.println(aluno.nome);
        }

        for (Aluno aluno: curso3.alunos) {
            System.out.println("\nAlunos do curso 3");
            System.out.println(aluno.nome);
        }

    }
}
