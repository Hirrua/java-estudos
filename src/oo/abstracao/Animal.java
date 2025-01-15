package oo.abstracao;

/*
Classe abstrata NÃO vira objeto, serve como uma base para classes concretas

Gato é um objeto. logo é uma classe concreta

Só serve de referencia, uma estrutura para seguir
*/

public abstract class Animal {
    String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    /*
     * Não vai chaves {}, visto que não preciso fazer a implementação, quem Herdar fica com a responsabilidade
     */
    public abstract void fazerSom();
}