package arrays_collections;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
    public static void main(String[] args) {

        /*
        * Pode ser Heterogêneo/Homogêneo
        * Não aceita obj duplicados (fica com WARNING)
        * Não é indexado
        * Não é ordenado (por padrão)
        */

        Set<String> primeiraLista = new HashSet<String>(); // Um SET Genérico: especificamente uma string

        primeiraLista.add("Tuta");
        primeiraLista.add("Bradock");
        System.out.println("\nPrimeira lista: " + primeiraLista);

        Set<String> segundaLista = new HashSet<>();

        segundaLista.add("Mumu");
        segundaLista.add("Mimi");
        segundaLista.add("Bradock");

        System.out.println(primeiraLista.addAll(segundaLista)); // "Concatena" as duas listas
        System.out.println((segundaLista.retainAll(primeiraLista))); // Retorna quem está nas duas listas

        System.out.println("\nNova lista: " + segundaLista);

    }
}
