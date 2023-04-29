package Exam2016AMoed87;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {5,2,4};
        int[] a1 = {1,2,3,4};
        System.out.println(minDiff(a)); // 1
        System.out.println(minDiff(a1)); // 0
    }
    public static int minDiff(int[] a){
        return minDiff(a,0,0,0);
    }

    private static int minDiff(int[] a, int i, int s1, int s2) {
        if(i==a.length) return Math.abs(s1-s2);
        return Math.min(minDiff(a,i+1,s1+a[i], s2), minDiff(a,i+1, s1, s2+a[i]));
    }
}
