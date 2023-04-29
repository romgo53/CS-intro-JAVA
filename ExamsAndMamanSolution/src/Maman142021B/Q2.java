package Maman142021B;

public class Q2 {
    public static boolean hasSink(int[][] matrix) {
        int n = matrix.length;
        int candidate = 0;

        // First pass: identify candidate
        for (int i = 1; i < n; i++) {
            if (matrix[candidate][i] == 1) {
                candidate = i;
            }
        }

        // Second pass: verify candidate
        for (int i = 0; i < n; i++) {
            if (i != candidate && (matrix[candidate][i] == 1 || matrix[i][candidate] == 0)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[][] m = {{0,1,0,1,1,0},{1,0,1,1,0,0},{0,0,0,1,0,1},{0,0,0,0,0,0},{1,0,1,1,0,0},{0,1,0,1,1,1}};
        System.out.println(hasSink(m));
    }
}
