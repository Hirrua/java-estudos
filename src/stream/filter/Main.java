package stream.filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7);

        System.out.println("\nUsando FILTER");
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::print); // Retonar uma lista menor apenas com os números que são pares
        System.out.println("\nUsando MAP");
        numeros.stream().map(n -> n % 2 == 0).forEach(System.out::print); // MAP retorna uma lista do memso tammnaho com True ou False

        System.out.println("\nUsando lambda + filter + map");
        Aluno a1 = new Aluno("Joao", 7.8);
        Aluno a2 = new Aluno("Gui", 7.0);
        Aluno a3 = new Aluno("Bia", 9.3);
        Aluno a4 = new Aluno("Rebeca", 5.8);
        Aluno a5 = new Aluno("Pedro", 7.1);
        Aluno a6 = new Aluno("Mimi", 10);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5,a6);

        Predicate<Aluno> aprovados = a -> a.nota >= 7;
        Function<Aluno, String> frase = a -> "Parabéns " + a.nome + " você foi aprovado!";

        alunos.stream().filter(aprovados).map(frase).forEach(System.out::print);
    }
}
