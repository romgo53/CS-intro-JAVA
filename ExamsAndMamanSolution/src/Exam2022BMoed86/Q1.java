package Exam2022BMoed86;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {12,22,23,54,11},
                {43,35,21,20,30},
                {34,23,43,22,30},
                {25,31,2,20,34},
                {10,22,10,11,10},
                {40,13,3,1,23}
        };
        System.out.println(maxPath(m));
    }
    public static int maxPath(int[][] mat){
        return maxPath(mat,0,0,0);
    }

    private static int maxPath(int[][] m, int i, int j, int sum) {
        if(i > m.length-1 || j > m[0].length-1)
            return Integer.MIN_VALUE;
        if(i==m.length-1&&j==m[0].length-1)
            return sum+m[i][j];

        int val = m[i][j];
        int op1 = maxPath(m,i+val/10, j+val%10, sum+val);
        int op2 = maxPath(m,i+val%10, j+val/10, sum+val);
        return Math.max(op1,op2);
    }


}
