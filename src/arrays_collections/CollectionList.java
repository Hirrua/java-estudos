package arrays_collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
    public static void main(String[] args) {
        /*
         * Usado quando NÃO sabemos o tamanho final (ex: base de dados)
         * Pode ser Heterogêneo/Homogêneo
         * Aceita obj duplicados
         * É ordenado
         * É indexado
         */

        List<String> lista = new ArrayList<>();
        lista.add("Bento");
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Jorge");

        System.out.println("\nAntes de remover o index 2\n");
        for (String lista_pessoas: lista) {
            System.out.println(lista_pessoas);
        }

        System.out.println("\nPirmeiro: " + lista.getFirst());
        System.out.println("Index 3: " + lista.get(3));
        lista.remove(2); // Esse retorna quem foi removido

        System.out.println("\nDepois de remover o index 2\n");
        for (String lista_pessoas: lista) {
            System.out.println(lista_pessoas);
        }
    }
}
