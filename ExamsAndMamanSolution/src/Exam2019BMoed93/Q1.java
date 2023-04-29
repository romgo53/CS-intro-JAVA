package Exam2019BMoed93;

public class Q1 {

    public static boolean isSum(int[] a, int num){
        return isSum(a,num,0,0);
    }

    private static boolean isSum(int[] a, int n, int i, int streak) {
        if(i>a.length-1)
            return false;
        if(n==0)
            return true;
        if(streak == 2)
            return isSum(a,n,i+1,0);
        return isSum(a,n-a[i], i+1, streak+1) || isSum(a,n,i+1,0);
    }

    public static void main(String[] args) {
        int[] a = {5,4,2,1,3};
        System.out.println(isSum(a,0));
        System.out.println(isSum(a,8));
        System.out.println(isSum(a,9));
        System.out.println(isSum(a,2));
        System.out.println(isSum(a,11));
        System.out.println(isSum(a,17));
    }
}
