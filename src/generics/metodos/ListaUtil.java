package generics.metodos;

import java.util.List;

public class ListaUtil {

    public static Object getUltimo (List<?> lista) {
        return lista.getLast();
    }

    public static <T> T getLast (List<T> lista) {
        return lista.getLast();
    }
}
