package Exam2019BMoed86;

public class Q1 {

    public static void main(String[] args) {
        int[][] m = {
                {1, 3, 1, 6},
                {2, 8, 1, 2},
                {6, 2, 7, 5},
                {2, 4, 1, 3}
        };
        System.out.println(howManyPaths(m));
    }

    public static int howManyPaths(int[][] mat) {
        return howManyPaths(mat, 0, 0);
    }

    private static int howManyPaths(int[][] m, int i, int j) {
        if (i < 0 || j < 0 || i > m.length - 1 || j > m[0].length - 1 || m[i][j] == 0)
            return 0;
        if (i == m.length - 1 && j == m[0].length - 1)
            return 1;
        int tmp = m[i][j];
        m[i][j] = 0;
        int up = howManyPaths(m, i - tmp, j);
        int down = howManyPaths(m, i + tmp, j);
        int left = howManyPaths(m, i, j - tmp);
        int right = howManyPaths(m, i, j + tmp);
        m[i][j] = tmp;
        return up + down + left + right;
    }
}
