package Exam2021AMoed85;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {2,3,8,14,15,35};
        System.out.println(findAverage(a, 11));
    }

    public static boolean findAverage(int[] a, double x){
        int sum=0, low=0, high=a.length-1;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        while(low<=high){
            if((double)sum/(high-low+1) == x)
                return true;
            else if((double)sum/(high-low+1) > x){
                sum-=a[high];
                high--;
            }
            else {
                sum -= a[low];
                low++;
            }
        }
        return false;
    }
}
