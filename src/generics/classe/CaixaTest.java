package generics.classe;

public class CaixaTest {

    public static void main(String[] args) {

        CaixaHeranca<Integer> algoHeranca = new CaixaHeranca();
        Integer caixaHeranca = algoHeranca.guardar(123456);
        System.out.println(caixaHeranca);
    }
}
