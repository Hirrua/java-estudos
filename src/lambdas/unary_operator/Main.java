package lambdas.unary_operator;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> maisQuatro = n -> n + 4;

        System.out.println(
                vezesDois.andThen(maisQuatro).apply(6)
        );
    }
}
