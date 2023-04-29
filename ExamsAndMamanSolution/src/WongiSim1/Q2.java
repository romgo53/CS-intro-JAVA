package WongiSim1;

public class Q2 {
    public static void main(String[] args) {
        int[] a1 = {0,2,5,6,7};
        int[] a2 = {0,3,9};
        int[] a3 = {0,2,6,7,9};
        int[] a4 = {0,4,8,12,20,22};
        System.out.println(MaxJumpMin(a1));
        System.out.println(MaxJumpMin(a2));
        System.out.println(MaxJumpMin(a3));
        System.out.println(MaxJumpMin(a4));
    }
    public static int MaxJumpMin(int[] a){
        int minJump = 0;
        for (int i = 0; i < a.length-2; i++) {
            minJump = Math.max(minJump, a[i+2]-a[i]);

        }
        return minJump;
    }
}
