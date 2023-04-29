package Exam2022BMoed96;

public class Q2 {

    public static void main(String[] args) {
        int[] a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
        System.out.println(kAlmostSearch(a, 10));
    }
    public static int kAlmostSearch(int[] a, int num){
        int low=0,high=a.length-1,mid=0;
        while(low<high){
            mid = (low+high)/2;
            while (mid > low && a[mid] == 0)
                mid--;
            if(a[mid] == num)
                return mid;
            if(a[mid] < num)
                low = mid+1;
            else
                high = mid-1;
        }
        if(a[mid] == num)
            return mid;
        return -1;
    }
}
