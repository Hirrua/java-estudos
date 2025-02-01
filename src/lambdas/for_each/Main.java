package lambdas.for_each;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        * Pode ser usando o .forEach, ele realiza o for para cada item
        * O forEach recebe um Consumer<T> e não retorna nada, tornando assim um função terminaria
        *
        * Method References -> referencia para um mét. usando com ::
        * */

        List<String> nomes = Arrays.asList("Lua", "Sol", "Saturno");

        System.out.println("forEach:");
        nomes.forEach((nome) -> {
            System.out.println(nome); // sem Method References
        });

        System.out.println("\n\nUtilizando Method References");
        nomes.forEach(System.out::println); // O forEach pega os nomes presente na lista e passa para o println

        /*
        * Por de baixo dos panos o forEach passa por todos os nomes passando como parametros para o SOUT (met. referencia)
        * */
    }
}
