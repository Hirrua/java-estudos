package vetores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] numerosMulti = new int[3][3];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numerosMulti.length; i++) {
            for (int j = 0; j < numerosMulti[i].length; j++) {
                System.out.println("["+i+"}"+"["+j+"]"+"= ");
                numerosMulti[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < numerosMulti.length; i++) {
            for (int j = 0; j < numerosMulti[i].length; j++) {
                System.out.print(numerosMulti[i][j]);
            }
        }
    }
}
