package Maman142017B;

public class Q3 {

    public static void main(String[] args) {
        int[] s = {4,5};
        System.out.println(isSumOf(s,13));
        System.out.println(isSumOf(s,6));
        System.out.println(isSumOf(s,0));
        int[] s1 = {4,9,3};
        System.out.println(isSumOf(s1,15));
        System.out.println(isSumOf(s1,5));

    }
    public static boolean isSumOf(int [] s, int n){

        return isSumOf(s,n,0);
    }

    private static boolean isSumOf(int[] s, int n, int i) {
        if(i > s.length-1)
            return false;
        if(n<0)
            return false;
        if(n==0)
            return true;
        return isSumOf(s, n-s[i], i) || isSumOf(s,n,i+1);
    }
}
