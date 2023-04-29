package Exam2016AMoed91;

public class Q1 {

    public static void main(String[] args) {
        char[][] minChess = {
                {'0','0','0','0'},
                {'0','0','K','0'},
                {'0','0','0','0'},
                {'H','0','0','0'}
        };
        System.out.println(minPath(minChess,3,0));
    }
    // minChess question
    public static int minPath(char[][] m, int i, int j){
        return minPath(m,i,j, 0);
    }

    private static int minPath(char[][] m, int i, int j, int len) {
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == 'X'){
            return Integer.MAX_VALUE;
        }
        if(m[i][j] == 'K')
            return len;
        char tmp = m[i][j];
        m[i][j] = 'X';
        int op1 = minPath(m,i+2,j+1,len+1);
        int op2 = minPath(m,i+2,j-1,len+1);
        int op3 = minPath(m,i-2,j+1,len+1);
        int op4 = minPath(m,i-2,j-1,len+1);
        int op5 = minPath(m,i+1,j+2,len+1);
        int op6 = minPath(m,i+1,j-2,len+1);
        int op7 = minPath(m,i-1,j+2,len+1);
        int op8 = minPath(m,i-1,j-2,len+1);
        m[i][j] = tmp;
        return Math.min(Math.min(Math.min(op1,op2),Math.min(op3,op4)), Math.min(Math.min(op5,op6),Math.min(op7,op8)));
    }
}
