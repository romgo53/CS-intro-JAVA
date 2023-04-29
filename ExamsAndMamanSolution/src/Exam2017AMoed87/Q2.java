package Exam2017AMoed87;

public class Q2 {
    public static void main(String[] args) {
        int[]a = {4,5,6,12,13};
        System.out.println(isPythagorean(a));
    }
    public static boolean isPythagorean(int[] arr){
        for (int i = arr.length-1; i >= 2; i--) {
            int b = i-1, a=0;
            while(a<b){
                System.out.println("(" + a + ", " + b  + ", " + i + ")");
                if(Math.pow(arr[a],2) + Math.pow(arr[b],2) == Math.pow(arr[i],2)) return true;
                else if(Math.pow(arr[a],2) + Math.pow(arr[b],2) < Math.pow(arr[i],2)) a++;
                else b--;

            }
        }
        return false;
    }
}
