package generics.instancia;

public class CaixaTest {

    public static void main(String[] args) {

        /*
        * A mesma Caixa<T> Generica, recebendo tipos especificos quando é instanciada
        * */

        Caixa<String> caixaA = new Caixa<>();
        String algoA = (String) caixaA.guardar("Estou guardando o tipo STRING");
        System.out.println(algoA);

        Caixa<Integer> caixaB = new Caixa<>();
        Integer algoB = (Integer) caixaB.guardar(35);
        System.out.println(algoB);
    }
}
