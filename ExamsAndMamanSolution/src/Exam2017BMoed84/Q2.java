package Exam2017BMoed84;

public class Q2 {

    public static void main(String[] args) {
        int[] a ={65,70,-5,3,48,49,52};
        System.out.println(findSum(a,45));
    }

    /***
     * Time complexity: O(n)
     * Space: O(1)
     */
    public static boolean findSum(int[] a, int sum){
        int first=0, last=0;
        int next, prev;
        int i = 0;
        while(i<a.length){
            prev = i-1 > -1 ? i-1:a.length-1;
            next = i+1<a.length ? i+1:0;
            if(a[prev] > a[i] && a[next] > a[i]){
                first = i;
                last =prev;
            }
            i++;
        }
        while(first!=last){
            if(a[first] + a[last] == sum)
                return true;
            if(a[first]+a[last] > sum)
                last = last - 1 > -1?last-1: a.length-1;
            else
                first = first+1<a.length? first +1:0;

        }
        return false;
    }
}
