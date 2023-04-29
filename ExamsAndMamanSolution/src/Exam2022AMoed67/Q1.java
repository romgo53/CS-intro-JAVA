package Exam2022AMoed67;

public class Q1 {

    public static void main(String[] args) {
        int[][] m = {
                {1,2,3,2,0,3,1},
                {0,1,0,0,0,3,0},
                {0,0,1,0,0,0,0},
                {5,0,0,1,0,0,0},
                {7,0,0,0,1,0,0},
                {8,0,0,0,0,1,0},
                {1,0,0,0,0,0,0}
        };
        System.out.println(maxMatrix(m));
    }
    public static boolean isIdentity(int[][] mat, int x, int size){
        if(size == 1)
            return mat[x][x] == 1;
        return isIdentity(mat,x,size,x,x);
    }

    private static boolean isIdentity(int[][] mat, int x, int size, int i, int j) {
        if(i==x+size)
            return true;
        if(j==x+size)
            return isIdentity(mat,x,size, i+1 ,x);
        if(i==j && mat[i][j] != 1)
            return false;
        else if(i!=j && mat[i][j] != 0)
            return false;
        return isIdentity(mat,x,size,i,j+1);
    }

    public static int maxMatrix(int[][] mat){
        return maxMatrix(mat,0, 0);
    }

    private static int maxMatrix(int[][] m, int i, int max) {
        if(i== m.length/2) {
            if (m[i][i] == 1)
                return Math.max(max, 1);
            return max;
        }
        if(isIdentity(m,i,m.length-(2*i)))
            max = Math.max(max, m.length-2*i);

        return maxMatrix(m,i+1,max);
    }
}
