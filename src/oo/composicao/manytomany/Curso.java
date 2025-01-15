package oo.composicao.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    final String nome;
    final List<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this); // Relação N para N, estou adicionando esse aluno a esse curso (BI DIRECIONAL)
    }
}
