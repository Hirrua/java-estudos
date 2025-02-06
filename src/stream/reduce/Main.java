package stream.reduce;

import java.util.Arrays;
import java.util.List;

public class Main {

    /*
    * Recebemos um acumulador
    * (acumulador, n)
    *
    * é passado para cada um da chamada
    * O valor do acumudalor é passado para próxima interação
    * Podemos dar um valor inicial para acumulador
    *
    * REDUCE -> BINARY OPERATOR
    * Ele gera um Optional
    *
    * Reduce é uma função terminária
    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,8,9,7);

        var resultado = numeros.stream().reduce((acum, n) -> acum += n).get();
        System.out.println(resultado);
    }
}
