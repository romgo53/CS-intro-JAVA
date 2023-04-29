package Exam2015AMoed83;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {3,13,15,28,30},
                {40,51,52,29,30},
                {28,10,53,54,53},
                {53,12,55,53,60},
                {70,62,56,20,80},
                {80,81,90,95,100}
        };
        System.out.println(shortestPath(m));
    }
    public static int shortestPath(int[][] mat){
        return shortestPath(mat, 0,0,0,0);
    }

    private static int shortestPath(int[][] m, int i, int j, int prev, int sum) {
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == -1 || m[i][j] - prev < 1){
            return Integer.MAX_VALUE;
        }
        if (i==m.length-1 && j==m[0].length-1){
            return sum+1;
        }
        int tmp = m[i][j];
        m[i][j] = -1;
        int op1 = shortestPath(m,i+1,j,tmp, sum+1);
        int op2 = shortestPath(m,i-1,j,tmp, sum+1);
        int op3 = shortestPath(m,i,j+1,tmp, sum+1);
        int op4 = shortestPath(m,i,j-1,tmp, sum+1);
        m[i][j] = tmp;
        return Math.min(Math.min(op1, op2), Math.min(op3,op4));
    }
}
