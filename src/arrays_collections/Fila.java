package arrays_collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add adicionam elementos na fila
        // Muda o comportamento quando a fila está cheia

        fila.add("Ana"); // Retorna False se não conseguir adicionar
        fila.offer("Bruno"); // Limita até quantos podem ser add - Gera erro
        fila.add("Daniel");
        fila.offer("Marcos");

        // Peek e Element pegam os elemento
        // Peek quando está vazio retorna NULL
        // Element quando etá vazio lança uma excessão
        System.out.println(fila.peek()); // Pega o primeiro elemento
        System.out.println(fila.element());

        // Retorna o primeiro da fila e já remove
        System.out.println(fila.poll());
    }
}
