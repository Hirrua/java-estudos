package lambdas.interface_lambda;

public class Main {

    public static void main(String[] args) {

        // Utilizando a interface Calculo para criar uma Lambda Expression () -> {}
        Calculo calculo = (x, y) ->  x * y;

        // Chamo o mét. presente na interface (onde o caluculo recebeu) e realizo a operação
        System.out.println(calculo.calculadora(5,4));
    }
}
