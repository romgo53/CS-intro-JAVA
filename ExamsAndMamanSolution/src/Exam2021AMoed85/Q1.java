package Exam2021AMoed85;

public class Q1 {
    public static void main(String[] args) {
        int[][] m = {
                {0,15,80,90},
                {-1,0,40,50},
                {-1,-1,0,70},
                {-1,-1,-1,0}
        };
        System.out.println(minPrice(m));
    }
    public static int minPrice(int[][] m){
        return minPrice(m, 0,0,0);
    }
    private static int minPrice(int[][] m, int i, int j,int sum){
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] == -1){
            return Integer.MAX_VALUE;
        }
        if(j == m[i].length-1)
            return sum+m[i][j];
        return Math.min(minPrice(m,i+1,j,sum+m[i][j]), minPrice(m,i,j+1,sum));



    }
}
