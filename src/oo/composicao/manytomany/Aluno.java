package oo.composicao.manytomany;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    // Muitos alunos, tem muitos cursos
    final String nome;
    final List<Curso> cursos = new ArrayList<>(); // FINAL, torna constante o endereço de memoria (posso add e remover itens normalmente)

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarCurso(Curso curso) {
        this.cursos.add(curso);
        curso.alunos.add(this); // Relação N para N, estou adicionando esse curso a esse aluno (BI DIRECIONAL)
    }
}
