package lambdas.binary_operator;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        /*
        * O Java já fornece interfaces para realizar operações
        * BinaryOperator<T> -> Recebe dois parametros do mesmo tipo (T deve ser um Wrapper) e retorna o mesmo
        * BinaryOperator<Double> -> return Double
        * Para passar os parametros deve chamar .apply();
        */

        BinaryOperator<Integer> calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(3, 2));

    }
}
