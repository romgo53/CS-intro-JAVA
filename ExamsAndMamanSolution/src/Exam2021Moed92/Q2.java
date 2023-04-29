package Exam2021Moed92;

public class Q2 {

    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,0,1,1,1,1,0,0};
        System.out.println(longestSequence(a, 0));
    }
    public static int longestSequence(int[] a, int k){
        int count0 = k, first0 = -1, count = 0, i = 0, j = 0, maxC = 0;
        while(i<a.length && j<a.length){
            if(a[j] == 0) {
                if (count0 == 0) {
                    maxC = Math.max(count, maxC);
                    i = (first0 > -1) ? first0 + 1 : j + 1;
                    j = i;
                    count = 0;
                    count0 = (k!=0)?1:k;
                    first0 = -1;
                } else {
                    count++;
                    if (first0 == -1) {
                        first0 = j;
                    }
                    count0--;
                    j++;
                }
            } else {
                j++;
                count++;
            }
        }
        return Math.max(count, maxC);
    }
}

