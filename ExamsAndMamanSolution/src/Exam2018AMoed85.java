public class Exam2018AMoed85 {
    public static void main(String[] args) {
        int[][] m = {
                {3, 13, 15, 28, 30},
                {55, 54, 53, 27, 26},
                {54, 12, 52, 51, 50},
                {50, 10, 8, 53, 11}
        };
        System.out.println(longestSlope(m, 1));
        int[] arr = {1,2,-5,-10,3,-1,3,3,7,-6,1};
        System.out.println(what(arr));
    }

    //Q1
    public static int longestSlope(int[][] mat, int num) {
        return longestSlope(mat, num, 0, 0, 1);
    }

    private static int longestSlope(int[][] m, int n, int i, int j, int max) {
        if (i == m.length)
            return max;
        if (j == m[i].length)
            return longestSlope(m, n, i + 1, 0, max);
        max = Math.max(max, slopeLen(m, n, i, j, 0, m[i][j] + n));
        return longestSlope(m, n, i, j + 1, max);
    }

    private static int slopeLen(int[][] m, int n, int i, int j, int sum, int prev) {
        if (i < 0 || i > m.length - 1 || j < 0 || j > m[i].length - 1 || prev - m[i][j] != n)
            return sum;
        int op1 = slopeLen(m, n, i + 1, j, sum + 1, m[i][j]);
        int op2 = slopeLen(m, n, i - 1, j, sum + 1, m[i][j]);
        int op3 = slopeLen(m, n, i, j + 1, sum + 1, m[i][j]);
        int op4 = slopeLen(m, n, i, j - 1, sum + 1, m[i][j]);
        return Math.max(Math.max(op1, op2), Math.max(op3, op4));
    }

    /**
     * Q2:
     * a: finds the sum of the longest subarray that sums up to an odd value
     * b: O(n^3)
     * c:
     * d: Time: O(n) Space: O(1)
     */
    public static int what(int[] arr) {
        int maxOddSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum % 2 != 0 && currentSum > maxOddSum) {
                maxOddSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxOddSum;
    }
}
