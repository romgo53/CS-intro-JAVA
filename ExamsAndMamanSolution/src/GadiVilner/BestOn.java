package GadiVilner;

public class BestOn {

    public static boolean isHighFactorRange(int n, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (n % i == 0) {
                if (i > n / i)
                    return true;
            }
        }
        return false;
    }

    public static void findFactor(int n) {
        int low = 1, high = n;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (isHighFactorRange(n, mid, mid)) {
                System.out.println(mid + ", " + (n / mid));
                return;
            }
            if (isHighFactorRange(n, low, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
    }

    public static int findBC(String s) {
        int i = 0;
        if (s.charAt(i) != 'a')
            return i;
        while (s.charAt(i) == 'a') {
            i += i + 2;
        }
        return i;
    }

    public static int findB(String s) {
        int lo = 0, hi = findBC(s);
        int mid = 0;
        while (lo <= hi) {
            mid = (lo + hi) / 2;
            if (s.charAt(mid) == 'b' && (mid == lo || s.charAt(mid - 1) == 'a')) {
                return mid;
            }
            if (s.charAt(mid) == 'a')
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        return -1;

    }

    public static int findDuplicates(int[] a) {
        int i = 0;
        while (i < a.length) {
            int ind = a[i];
            i = a[ind];
            a[ind] = 0;
            if (a[i] == 0)
                return ind;
        }
        return -1;
    }


    public static void main(String[] args) {
//        findFactor(8509);
        int[] a = {2, 4, 5, 3, 5, 1};
        int[] a1 = {1, 2, 2, 2, 2};
        String s = "aaaaaaaaaaaaaaaabccccccccccccccccc";
//        System.out.println(findB(s));
        System.out.println(findDuplicates(a1));
    }
}
