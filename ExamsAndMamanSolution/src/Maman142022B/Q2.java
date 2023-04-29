package Maman142022B;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        System.out.println(strictlyIncreasing(a));
    }
    public static int strictlyIncreasing (int[] a){
        int seq = 0, count = 0;
        for(int i=1;i<a.length;i++){
            if(a[i-1] < a[i]) {
                count += 1 + seq;
                seq++;
            } else {
                seq = 0;
            }
        }
        return count;
    }
}
