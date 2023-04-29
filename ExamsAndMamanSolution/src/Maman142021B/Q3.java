package Maman142021B;

public class Q3 {

    public static void main(String[] args) {
        boolean[][] m = {
                {false, true, false, false, true},
                {true, false, false, true, true},
                {false, false, true, true, false},
                {true, false, false, false, false},
                {true, true, true, false, false}
        };
        System.out.println(size(m, 1,0));
    }

    public static int size(boolean[][] m, int x, int y) {
        boolean[][] visited = new boolean[m.length][m[0].length];
        return size(m, x, y, x, y, visited, 0);
    }

    private static int size(boolean[][] m, int x, int y, int i, int j, boolean[][] visited, int s) {
        if (i < 0 || j < 0 || i > m.length - 1 || j > m[0].length - 1 || visited[i][j] || !m[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int m1 = size(m, x, y, i + 1, j + 1, visited, s);
        int m2 = size(m, x, y, i + 1, j - 1, visited, s);
        int m3 = size(m, x, y, i - 1, j + 1, visited, s);
        int m4 = size(m, x, y, i - 1, j - 1, visited, s);
        int m5 = size(m, x, y, i + 1, j, visited, s);
        int m6 = size(m, x, y, i - 1, j, visited, s);
        int m7 = size(m, x, y, i, j + 1, visited, s);
        int m8 = size(m, x, y, i, j - 1, visited, s);
        return 1 + m1+ m2+ m3+m4+m5+m6+m7+m8;
    }
}
