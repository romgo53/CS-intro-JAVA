package Exam2017BMoed85;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {0,4,6,11,11};
        int[] b = {10,20,30,40};
        printClosest(a,b,11);
        printClosest(a,b,13);
        printClosest(a,b,18);
        printClosest(a,b,70);
    }
    public static void printClosest(int[] a, int[] b, int x){
        int left = 0, right = b.length-1, diff = Integer.MAX_VALUE;
        int resL = 0, resR = 0;
        while (left<a.length && right >= 0){
            if(Math.abs(x- (a[left] +b[right])) < diff){
                diff = Math.abs(x- (a[left] +b[right]));
                resL = a[left];
                resR = b[right];
            }
            else if(a[left] +b[right] > x)
                right--;
            else left ++;
        }
        System.out.println(resL + " and " + resR);
    }
}
