package Exam2019BMoed83;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {1,1,1,1,1,1,1},
                {1,1,0,1,0,0,1},
                {1,1,1,1,0,1,1}
        };
        System.out.println(longestPath(m,2,5));
    }
    public static int longestPath(int[][] mat, int x, int y){
        return longestPath(mat,x,y,0,0,0);
    }
    private static int longestPath(int[][] m, int x, int y, int i, int j, int len){
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == 0){
            return Integer.MIN_VALUE;
        }
        if(i==x&&j==y)
            return len+1;
        int tmp = m[i][j];
        m[i][j] = 0;
        int up = longestPath(m,x,y,i-1,j,len+1);
        int down = longestPath(m,x,y,i+1,j,len+1);
        int left = longestPath(m,x,y,i,j-1,len+1);
        int right = longestPath(m,x,y,i,j+1,len+1);


        m[i][j] = tmp;
        return Math.max(Math.max(up,down), Math.max(left,right));
    }
}
