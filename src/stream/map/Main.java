package stream.map;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        List<String> marcas = Arrays.asList("bmw","audi", "porsche");
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

        System.out.println(marcas.stream().map(Utilitarios.maiuscula).map(primeiraLetra).map(Utilitarios.grito()));
    }
}
