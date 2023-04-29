package Exam2016AMoed87;

public class Q2 {
    public static void main(String[] args) {
        int[] a={0,1,0,1,1};
        System.out.println(passingCars(a));
    }
    public static int passingCars(int[] a){
        int count0=0, sum=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==0) count0++;
            else sum+=count0;
        }
        return sum;
    }
}
