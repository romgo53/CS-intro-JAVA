package Maman142022A;

public class Q1 {

    public static void main(String[] args) {
        int[] a = {1,3,5,4,8,2,4,3,6,5};
        System.out.println(findMinDiff(a,3,2));
        System.out.println(findMinDiff(a,2,5));
        System.out.println(findMinDiff(a,2,7));
    }
    public static int findMinDiff(int[] a, int x, int y){
        int i=0, j=a.length-1,minDiff=Integer.MAX_VALUE;
        while(i<j){
            if(a[i] == x || a[i] == y){
                if(a[i] != a[j] && (a[j] == x || a[j] == y)) {
                    minDiff = Math.min(minDiff, j - i);
                    i++;
                }
                else
                    j--;
            } else {
                j = a.length-1;
                i++;
            }
        }
        return minDiff;
    }

}
