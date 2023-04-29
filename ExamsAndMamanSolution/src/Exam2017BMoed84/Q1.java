package Exam2017BMoed84;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(ways(4,2));
    }

    private static int ways(int k, int n) {
        if(k==0 && n==0)
            return 1;
        if(k==0)
            return 0;
        return ways(k-1,n-1) + ways(k-1, n+1);
    }
}
