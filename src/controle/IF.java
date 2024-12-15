package controle;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota = entrada.nextDouble();

        if (nota < 5.8) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        entrada.close();
    }
}
