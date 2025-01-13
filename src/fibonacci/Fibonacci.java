package fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int f1 = 0;
        int f2 = 1;
        int limit = entrada.nextInt();

        while (f2 < limit) {
            int fn = f1 + f2;

            if (f2 > fn) {
                break;
            }

            System.out.println(fn);
            f1 = f2;
            f2 = fn;
        }

    }
}
