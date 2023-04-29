package WongiSim3;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {4,2,0,3,2,5};
        int[] a1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedRainWater(a));
        System.out.println(trappedRainWater(a1));
    }
    public static int trappedRainWater(int[] a){
        int l = 0;
        int r = a.length-1;
        int maxHi = 0;
        int sum = 0;
        while (l<r){
            if(a[l] < a[r]){
                maxHi = Math.max(maxHi, a[l]);
                sum+= maxHi-a[l];
                l++;
            } else {
                maxHi = Math.max(maxHi, a[r]);
                sum+= maxHi-a[r];
                r--;
            }
        }
        return sum;
    }
}
