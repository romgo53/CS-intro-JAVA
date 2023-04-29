package Exam2019AMoed84;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(sumPow3(38));
    }
    public static boolean sumPow3(int n){
        return sumPow3(n,0);
    }

    private static boolean sumPow3(int n, int p) {
        if(n==0)
            return true;

        if(Math.pow(3,p)>n)
            return false;

        return sumPow3(n-(int)Math.pow(3,p), p+1) || sumPow3(n, p+1);
    }
}
