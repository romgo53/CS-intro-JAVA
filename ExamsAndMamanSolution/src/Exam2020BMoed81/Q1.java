package Exam2020BMoed81;

public class Q1 {

    public static int makeSum(int[] a, int k, int num) {
        return makeSum(a, k, num, 0);
    }

    private static int makeSum(int[] a, int k, int num, int i) {
        if (i > a.length - 1 || k < 0 || num < 0)
            return 0;

        if (k == 0 && num>-1) {
            return 1;
        }


        return makeSum(a, k - a[i], num - 1, i) + makeSum(a, k, num, i + 1);
    }

    public static void main(String[] args) {
        int[] a={2,5,10,20,50};
        System.out.println(makeSum(a,40,4));
    }
}
