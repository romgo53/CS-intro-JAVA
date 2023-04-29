package Maman142021B;

public class Q1 {
    public static int maximalDrop(int[] a){
        int peak = a[0], maxDrop =0;
        for(int i=0;i<a.length;i++){
            if(a[i] > peak)
                peak = a[i];
            else
                maxDrop = Math.max(maxDrop, peak-a[i]);
        }
        return maxDrop;
    }

    public static void main(String[] args) {
        int[] a = {5,21,3,22,12,7,27,6,4};
        int[] a1 = {5,21,3,22,12,7,27,14};
        int[] a2 = {5,15,3,22,12,7,27,14};
        System.out.println(maximalDrop(a));
        System.out.println(maximalDrop(a1));
        System.out.println(maximalDrop(a2));
    }
}
