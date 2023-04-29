package Exam2022AMoed89;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {3,3,2,-7,2,1,1,-2,-2};
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,-2,-3,-4,-5,4,2,-4,6,-2};
        System.out.println(longestSubarray(a));
        System.out.println(longestSubarray(a1));
        System.out.println(longestSubarray(a2));
    }
    public static int longestSubarray(int[] a){
        int i=0, j=1,prev = (a[i] > 0)? 1:-1, max = 1, start=0,end=0;
        while(i<a.length && j<a.length){
            if(prev < 0) {
                if (!(a[j] > 0)) {
                    if (max < j - i) {
                        start = i;
                        end = j - 1;
                        max = j - i;
                    }
                    i = j;
                    j++;
                } else {
                    j++;
                    prev *= -1;
                }
            } else {
                if(!(a[j] < 0)){
                    if(max < j-i){
                        start = i;
                        end = j-1;
                        max = j-i;
                    }
                    i=j;
                    j++;
                } else {
                    j++;
                    prev *= -1;
                }
            }
        }
        if(max < j-i){
            start = i;
            end = j-1;
            max = j-i;
        }
        System.out.println("Starting index="+start);
        System.out.println("Ending index="+end);
        return max;
    }
}
