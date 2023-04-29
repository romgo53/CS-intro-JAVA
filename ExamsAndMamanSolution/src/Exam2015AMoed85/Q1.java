package Exam2015AMoed85;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {1,1,1,10,1,1},
                {11,11,8,11,9,1},
                {10,6,10,5,10,7},
                {3,8,4,10,10,5 },
                {1,2,6,6,6,  2 }
        };
        System.out.println(countRopes(m));
    }
    public static int countRopes(int[][] mat){
        return countRopes(mat,0,0);
    }

    public static int countRopes(int[][] m, int i, int ropes){
        if(i>m[0].length-1)
            return ropes;

        ropes = ropes + countRopes(m,1,i-1,m[0][i]) + countRopes(m,1,i+1,m[0][i]) + countRopes(m,1,i,m[0][i]);
        return countRopes(m,i+1,ropes);
    }

    private static int countRopes(int[][] m, int i, int j, int prev) {
        if(j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == -1 || prev <=m[i][j]){
            return 0;
        }
        if(i==m.length-1)
            return 1;
        int tmp = m[i][j];
        int res = countRopes(m, i+1, j-1,tmp) + countRopes(m,i+1,j+1,tmp) + countRopes(m,i+1,j,tmp);
        return res;
    }
}
