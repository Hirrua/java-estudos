package fundamentos;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual o seu nome: ");

        String nome = teclado.nextLine();
        System.out.printf("Meu nome é: %s", nome);

        teclado.close();
    }
}
