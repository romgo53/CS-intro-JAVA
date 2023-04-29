package Exam2016AMoed83;

public class Q1 {

    public static void main(String[] args) {
        int[][] m = {
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}
        };
        System.out.println(minPoint(m));
    }
    public static int minPoint(int[][] m){

        return minPoint(m, 0);
    }

    private static int minPoint(int[][] m, int min) {
        if(checkMin(m,0,0, min))
            return min;
        return minPoint(m,min+1);
    }

    private static boolean checkMin(int[][] m, int i, int j,int min) {
        if(i>m.length-1 || j>m[0].length-1 ) return false;
        min += m[i][j];
        if(min<=0){
            return false;
        }
        if(i==m.length-1 && j == m[0].length-1){
            return true;
        }
        return checkMin(m,i+1,j,min) || checkMin(m,i,j+1,min);
    }
}
