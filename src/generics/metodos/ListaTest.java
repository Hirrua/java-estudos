package generics.metodos;

import java.util.Arrays;
import java.util.List;

public class ListaTest {

    public static void main(String[] args) {
        List<String> langs = Arrays.asList("Java", "GO", "PHP", "Ruby");
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);

        String ultimaLang = (String) ListaUtil.getUltimo(langs);

        System.out.println(ultimaLang);
        System.out.println(ListaUtil.getLast(nums));

    }
}
