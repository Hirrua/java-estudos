package vetores;

public class DiagonalMulti {
    public static void main(String[] args) {

        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int diagonal = 1;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    diagonal *= matriz[i][j];
                }
            }
        }
        System.out.println(diagonal);
    }
}
