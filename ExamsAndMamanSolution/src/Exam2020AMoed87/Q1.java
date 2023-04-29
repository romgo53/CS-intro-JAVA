package Exam2020AMoed87;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {1,2,3},
                {1,2,3},
                {1,2,3}
        };
        System.out.println(totalWays(m,3));
    }

    public static int totalWays(int[][] m, int k) {
        if (k == 0) return 0;
        return totalWays(m, k, 0, 0, 'S');
    }

    // 'S' == Start, 'R' == Right, 'D' == Down
    private static int totalWays(int[][] m, int k, int i, int j, char prevMove) {
        if (i == m.length - 1 && j == m[0].length - 1 && k == 0)
            return 1;
        if (i > m.length - 1 || j > m[0].length - 1 || k == -1)
            return 0;

        int op1 = 0, op2 = 0;
        if(prevMove == 'S'){
            op1=totalWays(m,k,i+1,j,'D');
            op2=totalWays(m,k,i,j+1,'R');
        } else if (prevMove == 'D'){
            op1 = totalWays(m,k,i+1,j,'D');
            op2 = totalWays(m,k-1,i,j+1,'R');
        } else {
            op1 = totalWays(m,k-1,i+1,j,'D');
            op2 = totalWays(m,k,i,j+1,'R');
        }
        return op1 + op2;
    }
}
