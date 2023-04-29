package Exam2019AMoed84;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {5,7,-2,10};
        System.out.println(average(a));
    }
    public static int average(int[] a){
        if(a.length <=2){
            return 0;
        }
        int sum1=0,sum2=0, ind = 0;
        double maxDiff=Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
            sum1+=a[i];
        for (int i = 0; i < a.length; i++) {
             sum1-=a[i];
             sum2+=a[i];
             double diff = Math.abs((double)sum1/(a.length-1-(1+i)) - (double)sum2/(i+1));
             if(diff > maxDiff) {
                 maxDiff = diff;
                 ind = i;
             }
        }
        return ind;
    }
}
