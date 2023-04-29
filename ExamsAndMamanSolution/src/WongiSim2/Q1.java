package WongiSim2;

public class Q1 {
    public static void main(String[] args) {
        int[][] m1 = {
                {1,0,0,0},
                {0,0,0,0},
                {0,0,0,2}
        };
        int [][] m2 = {
                {1,0,0,0},
                {0,0,0,0},
                {0,0,2,-1}
        };
        System.out.println(uniquePaths(m1));
        System.out.println(uniquePaths(m2));
    }
    public static int uniquePaths(int[][] mat){

        return uniquePaths(mat, 0,0);
    }


    private static int uniquePaths(int[][] m, int i, int j) {
        if (i>m.length-1)
            return -1;
        if(j>m[0].length-1)
            return uniquePaths(m, i+1, 0);
        if(m[i][j] == 1)
            return countPath(m,i,j);
        return uniquePaths(m, i, j+1);
    }
    private static int countPath(int[][] m, int i, int j){

        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j]==-1)
            return 0;
        if(m[i][j] == 2) {
            int es = countEmptySquares(m,0,0,m.length,m[0].length);
              return  es==0 ? 1 : 0;
        }
        int tmp = m[i][j];
        m[i][j] = -1;
        int res = countPath(m,i+1,j) + countPath(m,i-1,j) + countPath(m,i,j+1) + countPath(m,i,j-1);
        m[i][j] = tmp;
        return res;
    }

    private static int countEmptySquares(int[][] mat, int i, int j, int m, int n) {
        if (i>=m)
            return 0;
        if(j>=n)
            return countEmptySquares(mat, i+1, 0, m,n);
        int count = mat[i][j] == 0 || mat[i][j] == 1 ? 1:0;
        return count + countEmptySquares(mat, i, j+1,m,n);
    }
}
