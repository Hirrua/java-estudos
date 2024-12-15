package arrays_collections;

import java.util.HashSet;
import java.util.Set;

public class HashSET {
    public static void main(String[] args) {

        /*
        * Pode ser Heterogêneo/Homogêneo
        * Não aceita obj duplicados (fica com WARNING)
        * Não é indexado
        * Não é ordenado (por padrão)
        * */

        Set<String> lista = new HashSet<>(); // Um SET Genérico: especificamente uma string

        lista.add("Tuta");
        lista.add("Bradock");
        lista.add("Outro");
        lista.add("Mimi");
        System.out.println("\nPrimeira lista: " + lista);

        lista.remove("Outro");
        System.out.println("\nPrimeira lista removido: " + lista);

        System.out.println("\nContain Bradock: " + lista.contains("Bradock"));

        Set<String> lista_outros = new HashSet<>();

        lista_outros.add("Aurora");
        lista_outros.add("Boreal");
        lista_outros.add("Mumu");
        lista_outros.add("John");
        lista_outros.add("Mimi");

        System.out.println(lista.addAll(lista_outros));
        System.out.println((lista_outros.retainAll(lista)));

        System.out.println("\nNova lista: " + lista_outros);

        System.out.println("\nFor each:");
        for (String animais: lista) {
            System.out.println(animais);
        }
    }
}
