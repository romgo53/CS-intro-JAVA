package Maman142021A;

public class Q2 {

    public static void main(String[] args) {
        int[] a = {1, 4, 45, 6, 0, 19};
        int[] a2 = {1, 10, 5, 2, 7};
        int[] a3 = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250};
        int[] a1 = {45,6,0};
        System.out.println(smallestSubSum(a,51));
        System.out.println(smallestSubSum(a2,9));
        System.out.println(smallestSubSum(a3,280));
        System.out.println(smallestSubSum(a1,51));

    }

    public static int smallestSubSum(int[] a, int x) {
        int i = 0, j = 0, sum = a[0], min = a.length + 1;
        while (j < a.length - 1) {
            if (sum >= x) {
                min = Math.min(min, j - i + 1);
                sum -= a[i];
                i++;
            } else {
                j++;
                sum += a[j];
            }
        }
        if (sum < x && min == a.length + 1)
            return -1;
        if (sum >= x)
            return Math.min(min, j - i + 1);
        return min;
    }

}

