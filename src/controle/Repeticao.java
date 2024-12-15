package controle;

import java.util.Scanner;

public class Repeticao {
    public static void main(String[] args) {

        System.out.println("While");
        int numero = 0;
        while (numero < 5) {
            System.out.println(numero);
            numero++;
        }

        System.out.println("For");
        for (int numero2 = 0; numero2 < 5; numero2++) {
            System.out.println(numero2);
        }

        System.out.println("Do While");
        int numero3 = 0;
        do {
            System.out.println(numero3);
            numero3++;
        } while (numero3 < 5);

        System.out.println("For each - ARRAYS or DATA SETS");
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

        Scanner entrada = new Scanner(System.in);
        String palavra = "";

        while (!palavra.equalsIgnoreCase("sair")) {
            palavra = entrada.nextLine();
            System.out.println(palavra);
        }

        entrada.close();
    }
}
