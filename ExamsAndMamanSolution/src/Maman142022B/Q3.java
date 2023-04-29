package Maman142022B;

public class Q3 {

    public static void main(String[] args) {
        int[] a = {4,5,6,5,4,3,4,2};
        System.out.println(longestFlatSequence(a));
    }
    public static int longestFlatSequence (int[] arr){
        return longestFlatSequence(arr, 0, 0);
    }

    private static int longestFlatSequence(int[] a, int i, int maxLen) {
        if(i> a.length-1)
            return maxLen;
        maxLen = Math.max(flatLen(a,i,a[i], a[i],0), maxLen);
        return longestFlatSequence(a,i+1,maxLen);
    }

    private static int flatLen(int[] a, int i, int firstNum, int secondNum, int len) {
        if (i == a.length)
            return len;
        if (firstNum != secondNum && a[i] != firstNum && a[i] != secondNum)
            return len;
        else if(firstNum==secondNum && Math.abs(firstNum-a[i]) == 1){
            return flatLen(a,i+1,firstNum, a[i], len+1);
        }

        return flatLen(a,i+1,firstNum, secondNum, len+1);

    }

}
