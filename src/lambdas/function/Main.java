package lambdas.function;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // Utilizando composição de funções o retorno de uma é a entrada da próxima .andThen() -> E então...

        Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";
        System.out.println(parOuImpar.apply(32));

        System.out.println("\nUtilizando composição de funções");
        Function<String, String> resultadoParOuImpar = res -> "Resultado é: " + res;
        System.out.println(parOuImpar.andThen(resultadoParOuImpar).apply(17));
    }
}
