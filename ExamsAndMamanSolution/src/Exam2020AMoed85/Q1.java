package Exam2020AMoed85;

public class Q1 {

    public static int findMaximum(int[][] m){
        if(m[0][0] == -1){
            return -1;
        }
        return findMaximum(m,0,0,0);
    }

    private static int findMaximum(int[][] m, int i, int j, int max) {
        if(j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == -1)
            return max;
        int op1=0, op2=0;
        if(i%2 == 0) {
            op1 = findMaximum(m,i+1,j,max+m[i][j]);
            op2 = findMaximum(m,i,j+1,max+m[i][j]);
        } else {
            op1 = findMaximum(m,i+1,j,max+m[i][j]);
            op2 = findMaximum(m,i,j-1,max+m[i][j]);
        }
        return Math.max(op1,op2);

    }

    public static void main(String[] args) {
        int[][] m = {
                {1,1,-1,1,1},
                {1,0,0,-1,1},
                {1,1,1,1,-1},
                {-1,-1,1,1,1},
                {1,1,-1,-1,1}
        };
        System.out.println(findMaximum(m));
    }
}

