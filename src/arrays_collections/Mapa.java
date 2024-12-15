package arrays_collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Hirruá");
        usuarios.put(2, "Ale");
        usuarios.put(3, "Mimi");

        System.out.println(usuarios);
        System.out.println(usuarios.get(1));
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.getOrDefault(2, "Não existe"));

        for (int chave: usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valores: usuarios.values()) {
            System.out.println(valores);
        }

        for (Map.Entry<Integer, String> registros: usuarios.entrySet()) {
            System.out.println(registros.getKey());
            System.out.println(registros.getValue());
        }
    }
}
