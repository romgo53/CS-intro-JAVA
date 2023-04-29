package Exam2020AMoed87;

public class Q2 {

    public static void printTriplets(int[] a, int num) {
        for (int i = 0; i < a.length; i++) {
            int lo = i, hi = a.length - 1;
            int target = num / a[i];
            while (lo < hi) {
                if (a[lo] * a[hi] == target) {
                    System.out.println(a[i] + " " + a[lo] + " " + a[hi]);
                    break;
                } else if (a[lo] * a[hi] < target)
                    lo++;
                else hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int[] a1 = {1,3,6,8};
        printTriplets(a,20);
//        printTriplets(a1,);
    }


}
