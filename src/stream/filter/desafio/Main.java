package stream.filter.desafio;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var fun = new Funcionarios("Miguel", "TI", 6000.00);
        var fun2 = new Funcionarios("Lili", "Financeiro", 5500.00);
        var fun3 = new Funcionarios("Otavio", "Vendas", 4000.00);
        var fun4 = new Funcionarios("Lucas", "TI", 10000.00);
        var fun5 = new Funcionarios("Citlali", "TI", 5700.00);
        var fun6 = new Funcionarios("Alex", "Contas a pagar", 3000.00);

        List<Funcionarios> funcionarios = Arrays.asList(fun,fun2,fun3,fun4,fun5,fun6);

        /*
        * FILTER recebe um PREDICATE
        * MAP recebe uma FUNCTION
        * */

        funcionarios.stream().filter(f -> f.getDepartamento().equals("TI"))
                .filter(f -> f.getSalario() >= 5000.00)
                .map(f -> "\nNome " + f.getNome() + " Salário: R$" + f.getSalario())
                .forEach(System.out::print);
    }
}
