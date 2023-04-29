package Exam2022AMoed67;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {22,24,26,32,34,36,38,40};
        System.out.println(findMissingIndex(a));
        int[] a2 = {20,22,28,30};
        System.out.println(findMissingIndex(a2));
    }
    public static int findMissingIndex(int[] a){
        int low=0, high=a.length-1,diff=a[1]-a[0], mid=0;
        if(diff > a[2]-a[1])
             return 1;
        if(diff < a[2]-a[1]){
            return 2;
        }
        while(low<=high){
            mid = (low+high)/2;
            if(a[0] + mid*diff == a[mid])
                low = mid+1;
            else
                high = mid-1;
        }
        if(a[mid-1] + diff == a[mid])
            return mid+1;
        return mid;
    }
}

