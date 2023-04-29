package Maman142022A;

public class Q3 {
    public static void main(String[] args) {
        int[] a = {2,4,1,1,2,2};
        System.out.println(equalSplit(a));
    }
    public static boolean equalSplit(int[] a){
        if(a.length%2 != 0)
            return false;
        return equalSplit(a, 0,0,0,0, 0);
    }

    private static boolean equalSplit(int[] a, int i, int s1, int s2, int s1Count, int s2Count) {
        if(i==a.length)
            return s1 == s2 && s1Count==s2Count;
        return equalSplit(a,i+1,s1+a[i], s2,s1Count+1,s2Count) || equalSplit(a,i+1,s1, s2+a[i],s1Count,s2Count+1);
    }
}
