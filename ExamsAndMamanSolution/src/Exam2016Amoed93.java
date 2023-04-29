public class Exam2016Amoed93 {
    //Q1
    public static int minChess(char[][] m, int i, int j, int sum){
        if(!isLegal(m,i,j))
            return Integer.MAX_VALUE;
        if(m[i][j] == 'K')
            return sum;
        char tmp = m[i][j];
        m[i][j] = 'X';
        int op1, op2, op3,op4,op5,op6,op7,op8;
        op1 = minChess(m,i-1,j-2, sum+1);
        op2 = minChess(m,i+1,j-2,sum+1);
        op3 = minChess(m,i-2,j+1,sum+1);
        op4 = minChess(m,i-2,j-1,sum+1);
        op5 = minChess(m,i+1,j+2,sum+1);
        op6 = minChess(m,i-1,j+2,sum+1);
        op7 = minChess(m,i+2,j+1,sum+1);
        op8 = minChess(m,i+2,j-1,sum+1);
        m[i][j] = tmp;
         return Math.min(Math.min(Math.min(op1,op2), Math.min(op3,op4)), Math.min(Math.min(op5,op6), Math.min(op7,op8)));
    }
    private static boolean isLegal(char[][] m, int i, int j){
        if(i>m.length-1 || j>m[0].length-1 || i < 0 || j<0 || m[i][j] == 'X')
            return false;
        return true;
    }
    // Q2
    public static int[] findUFO(){
        return new int[]{1,2};
    }


    public static void main(String[] args){
        char[][] m ={{'0','0','0','0'},{'0','0','K','0'},{'0','0','0', '0'},{'H','0','0','0'}};
        System.out.println(minChess(m,3,0,0));  //1
    }
}
