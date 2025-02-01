package lambdas.predicate;

import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Predicate<Integer> isPar = n -> n % 2 == 0;
        Predicate<Integer> tresDigitos = num -> num >= 100 && num <= 500;

        // Composição de funções para verificar se é verdadeiro ou não
        System.out.println(isPar.and(tresDigitos).test(4));
        System.out.println(isPar.and(tresDigitos).negate().test(4123));
        System.out.println(isPar.or(tresDigitos).test(4123));
    }
}
