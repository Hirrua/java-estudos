package arrays_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        // LAST IN LAST OUT

        Deque<String> livros = new ArrayDeque<>();

        livros.add("Arquitetura");
        livros.push("Java simples");
        livros.push("O pequeno principe");

        System.out.println(livros.peek());
        System.out.println(livros.poll());
    }
}
