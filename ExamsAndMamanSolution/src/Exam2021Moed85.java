import java.util.Arrays;

public class Exam2021Moed85 {
    // q1
    public static int minPrice(int[][] mat){
        return minPrice(mat,0,0, 0);
    }

    private static int minPrice(int[][] mat, int i, int j, int sum){
        if(i == j)
            return Integer.MAX_VALUE;
        if(i > j)
            return Integer.MAX_VALUE;
        if(i > mat.length - 1 || j > mat[0].length - 1)
            return Integer.MAX_VALUE;
        if(j == mat[0].length -1)
            return mat[i][j];
        return Math.min(1,2);
    }

    // Q2
    public static boolean findAve(int[] a, double x){
        int sum=0, lo=0, hi=a.length-1;
        for(int i=0;i<a.length;i++) {
            if((double)a[i] == x)
                return true;
            sum += a[i];
        }
        while(lo<hi){
            if(((double)sum/(hi-lo+1)) == x)
                return true;
            if(((double)sum/(hi-lo+1)) >= x){
                sum-=a[hi];
                hi--;
            }
            else if(((double)sum/(hi-lo+1)) <= x){
                sum-=a[lo];
                lo++;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] a = {2,3,8,14,15,35};
        System.out.println(findAve(a,8));
    }
}
