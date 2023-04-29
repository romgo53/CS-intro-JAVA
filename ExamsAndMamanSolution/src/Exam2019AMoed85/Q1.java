package Exam2019AMoed85;

public class Q1 {
    public static void main(String[] args) {
        int[] a ={1,3,2,3,10,10,3,2,4};
        System.out.println(longestPalindrome(a));
    }
    public static int longestPalindrome(int[] a){
        return longestPalindrome(a,0,1);
    }
    private static int longestPalindrome(int[] a, int i,int maxLen){
        if(i==a.length)
            return maxLen;
        int len = longestPalindrome(a,i,i+1,0);
        return longestPalindrome(a,i+1,Math.max(maxLen, len));
    }

    private static int longestPalindrome(int[] a, int left, int right,int maxLen){
        if(right==a.length)
            return maxLen;
        if(isPalindrome(a,left,right)){
            return longestPalindrome(a,left, right+1, Math.max(maxLen,right-left+1));
        }
        return longestPalindrome(a,left,right+1, maxLen);
    }

    private static boolean isPalindrome(int[] a, int left, int right) {
        if(left < right){
            if(a[left] != a[right])
                return false;
            return isPalindrome(a,left+1, right-1);
        }
        return true;
    }
}
