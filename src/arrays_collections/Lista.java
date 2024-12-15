package arrays_collections;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        /*
         * Pode ser Heterogêneo/Homogêneo
         * Aceita obj duplicados
         * É ordenado
         * É indexado
        * */

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Bento");
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Bia");
        lista.add("Jorge");

        System.out.println("Index 3: " + lista.get(3));
        lista.remove(2); // Esse retorna quem foi removido

        for (String lista_pessoas: lista) {
            System.out.println(lista_pessoas);
        }
    }
}
