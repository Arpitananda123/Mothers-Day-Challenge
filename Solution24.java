public class Solution24 {
    public void rotate(int[][] matrix) {
        int N = matrix.length;
        int[][] ans = new int[N][N];

        // Copy the original matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = matrix[i][j];
            }
        }

        // Rotate the matrix by 90 degrees clockwise
        int col = N - 1;
        int row = 0;
        while (col >= 0 && row < N) {
            for (int i = 0; i < N; i++) {
                int r = i;
                int c = col;
                matrix[r][c] = ans[row][i];
            }
            row++;
            col--;
        }
    }

    // Helper function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // Main method to test the rotate function
    public static void main(String[] args) {
        Solution24 sol = new Solution24();

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        sol.rotate(matrix);

        System.out.println("\nRotated Matrix (90 degrees clockwise):");
        printMatrix(matrix);
    }
}
