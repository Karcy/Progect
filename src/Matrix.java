/**
 * створити матрицю 5*5.
 */
public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
