package Exam2020AMoed85;

public class Q2 {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static int strictlyIncreasing(int[] a) {
        // for increasing streak we need to keep count of the increasing pairs so for {1,2,3} the return val will be 3 and not 2
        int count = 0, countStreak = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                count += 1 + countStreak;
                countStreak++;
            } else countStreak = 0;
        }
        return count;
    }

    public static int strictlyIncreasing2(int[] a) {
        int count = 0, streak = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                count += streak + 1;
                streak++;
            } else {
                streak = 0;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 4, 5};
        int[] a2 = {1, 3, 2};
        int[] a3 = {5, 4, 3, 2, 1};
        System.out.println(strictlyIncreasing2(a)); //4
        System.out.println(strictlyIncreasing2(a2));//1
        System.out.println(strictlyIncreasing2(a3)); // 0
    }

}
