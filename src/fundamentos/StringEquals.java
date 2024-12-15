package fundamentos;

import java.util.Scanner;

public class StringEquals {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String s = entrada.nextLine();
        System.out.println("2" == s);
        System.out.println("2".equals(s.trim()));

        entrada.close();

    }
}
