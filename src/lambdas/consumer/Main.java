package lambdas.consumer;

import lambdas.Produto;

import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
        var p1 = new Produto("Esponja", 5.00, 0.15);

        Consumer<Produto> mostrar = p -> System.out.println(p.getNome());
        mostrar.accept(p1);
    }
}
