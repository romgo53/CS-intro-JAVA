package Exam2015AMoed83;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {-2, 3, 5, 7, 12};
        System.out.println("Sum2:");
        System.out.println(sum2(a, 17)); // true
        System.out.println(sum2(a, 16)); // false

        System.out.println("Sum3: ");
        System.out.println(sum2(a, 17)); // true
        System.out.println(sum2(a, 16)); // false
    }

    // a. time O(n)
    // space O(1)
    public static boolean sum2(int[] a, int num) {
        int l = 0, r = a.length - 1;
        while (l < r) {
            int sum = a[l] + a[r];
            if (sum == num) return true;
            if (sum < num)
                l++;
            else
                r--;
        }
        return false;
    }

    //b.
    //
    public static boolean sum3(int[] a, int num) {
        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1;
            int k = a.length - 1;
            while (j < k) {
                int sum = a[i] + a[j] + a[k];
                if (sum == num) return true;
                if (sum < num)
                    j++;
                else
                    k--;
            }
        }
        return false;
    }
}

