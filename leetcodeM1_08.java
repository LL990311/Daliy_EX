import java.rmi.MarshalException;

public class leetcodeM1_08 {

    static int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

    public static void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 1 1 1
        // 1 0 1
        // 1 1 1
        setZeroes(matrix);
        // 1 0 1
        // 0 0 0
        // 1 0 1
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
