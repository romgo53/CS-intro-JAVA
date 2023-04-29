package Maman142019B;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {2,2,2,2,1,2,2};
        System.out.println(evenSumSeq(a));
    }
    public static int evenSumSeq(int[] a){
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        if(sum%2 == 0){
            return a.length;
        }
        int i=0,j=a.length-1;
        while (a[i] % 2 == 0 && a[j] % 2 == 0){
            i++;
            j--;
        }
        if(a[i]%2!=0)
            return a.length - 1 - i;
        return j;
    }
}
