package Exam2017BMoed85;

public class Q1 {

    public static void main(String[] args) {
        System.out.println(oneFiveSeven(3));
    }
    public static int oneFiveSeven(int n) {
        return oneFiveSeven(n, 0);
    }

    private static int oneFiveSeven(int n, int count) {
        if(n<0){
            return Integer.MAX_VALUE;
        }
        if(n==0)
            return count;
        int one = oneFiveSeven(n-1,count+1);
        int five = oneFiveSeven(n-5,count+1);
        int seven = oneFiveSeven(n-7,count+1);
        return Math.min(Math.min(one,five), seven);
    }
}
