public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrix1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // Sample matrix 1
        int[][] matrix2 = { { 7, 8 }, { 9, 10 }, { 11, 12 } }; // Sample matrix 2

        int[][] result = multiplyMatrices(matrix1, matrix2);

        if (result != null) {
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        } else {
            System.out.println("Matrices cannot be multiplied.");
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            // Matrices cannot be multiplied if columns of matrix1 != rows of matrix2
            return null;
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
