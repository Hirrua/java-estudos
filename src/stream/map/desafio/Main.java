package stream.map.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {

        /*
        * 1. Número para string binária
        * 2. Reverter a string
        * 3. Converter de volta para inteiro
        * */
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        Function<Integer, String> bin = Integer::toBinaryString;
        UnaryOperator<String> invert = n-> new StringBuilder(n).reverse().toString();
        Function<String, Integer> convert = n-> Integer.parseInt(n, 2);

        nums.stream().map(bin).map(invert).map(convert).forEach(System.out::println);
    }
}
