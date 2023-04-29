package Exam2016AMoed83;

public class Q2 {

    public static void main(String[] args) {
        int[] a = {1,2,5,3,6,10,9};
        System.out.println(findX(a,9));
    }
    public static boolean findX(int[] a, int x){
        int lo=0,hi=a.length-1,mid=0;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(a[mid] + a[mid+1] == x) return true;
            if(a[mid] + a[mid+1] > x) hi = mid-1;
            else lo = mid+1;
        }
        return false;
    }
}
