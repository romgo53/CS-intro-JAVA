package Exam2020BMoed96;

public class Q1 {
    public static int maxSumKnight(int[][] m){
        return maxSumKnight(m,0,0,0,m[0][0]);
    }

    private static int maxSumKnight(int[][] m, int i, int j, int sum, int prevVal){
        if(i<0||j<0||i>m.length-1||j>m[0].length-1||m[i][j]==-1||Math.abs(m[i][j]-prevVal) >= 2) {
            return 0;
        }
        if(i==m.length-1 && j==m[0].length-1)
            return sum + m[i][j];

        int temp = m[i][j];
        m[i][j] = -1;

        int opt1 = maxSumKnight(m,i-1,j+2,sum+temp, temp);
        int opt2 = maxSumKnight(m,i+1,j+2,sum+temp, temp);
        int opt3 = maxSumKnight(m,i+2,j-1,sum+temp, temp);
        int opt4 = maxSumKnight(m,i+2,j+1,sum+temp, temp);
        int opt5 = maxSumKnight(m,i+1,j-2,sum+temp, temp);
        int opt6 = maxSumKnight(m,i-1,j-2,sum+temp, temp);
        int opt7 = maxSumKnight(m,i-2,j+1,sum+temp, temp);
        int opt8 = maxSumKnight(m,i-2,j-1,sum+temp, temp);
        m[i][j] = temp;
        return Math.max(Math.max(Math.max(opt1,opt2), Math.max(opt3, opt4)), Math.max(Math.max(opt5,opt6), Math.max(opt7, opt8)));
    }

    public static void main(String[] args) {
        int[][] m = {
                {4,5,6,7,1},
                {3,5,1,7,4},
                {4,5,6,5,8},
                {3,4,7,7,9},
                {6,2,2,7,6}
        };
        System.out.println(maxSumKnight(m));
    }
}
