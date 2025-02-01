package lambdas.interface_lambda;

/*
* Lambdas por obrigação não podem ter mais de um met. deve ser uma interface funcional @FunctionInterface
* */

// Força ter apenas um mét. na interface
@FunctionalInterface
public interface Calculo {

    int calculadora(int x, int y);
}
