package Exam2020BMoed84;

public class Q2 {
    public static void main(String[] args) {
        findFactor(8509);
    }
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
}