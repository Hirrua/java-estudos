package lambdas.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        Supplier<List<String>> lista = () -> Arrays.asList("Sol", "Terra");
        System.out.println(lista.get());
    }
}
