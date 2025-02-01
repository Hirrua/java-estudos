package stream.list_iterator_stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Tuta", "Bradock", "Mimi");

        System.out.println("Usando Foreach");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Foreach");
        Iterator<String> it = aprovados.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço interno
    }
}
