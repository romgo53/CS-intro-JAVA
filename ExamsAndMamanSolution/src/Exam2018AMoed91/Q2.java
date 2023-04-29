package Exam2018AMoed91;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {35,17,13,252,4,128,7,3,81};
        printArr(a);
        System.out.println();
        sortMod(a,10);
        printArr(a);
    }
    public static void sortMod(int[] a, int k) {
        quickSortMod(a, k, 0, a.length - 1);
    }

    private static void quickSortMod(int[] a, int k, int lo, int hi) {
        if (lo < hi) {
            int m = partitation(a, k, lo, hi);
            quickSortMod(a, k, lo, m - 1);
            quickSortMod(a, k, m + 1, hi);
        }
    }

    private static int partitation(int[] a, int k, int lo, int hi) {
        int left = lo, right = hi;
        int pivot = a[lo] % k;
        while (left < right) {
            while (left < right && a[left] % k <= pivot) {
                left++;
            }
            while(a[right]%k > pivot){
                right--;
            }
            if(left<right)
                swap(a,left,right);
        }
        swap(a,lo,right);
        return right;
    }

    private static void printArr(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length-1]);
    }

    private static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }


}
