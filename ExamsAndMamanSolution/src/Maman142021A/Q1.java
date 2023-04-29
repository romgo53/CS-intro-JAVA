package Maman142021A;
public class Q1 {
    public static void main(String[] args) {
        int[] a1 = {6,6,18,18,-4,-4,12,9,9};
        int[] a2 = {8,8,-7,-7,3,3,4,0,0,10,10,5,5,3,3};
        int[] a = {8,8,-7,-7,3,3,4,4,0,0,10,10,6,6,5};
        int[] a3 = {5};
        System.out.println(findSingle(a1));
        System.out.println(findSingle(a2));
        System.out.println(findSingle(a));
        System.out.println(findSingle(a3));
    }

    public static int findSingle(int[] a){
        int low=0,high=a.length-1,mid=0;
        if(a.length == 1)
            return a[0];
        while(low<high){
            mid = (low+high)/2;
            if(a[mid] != a[mid-1] && a[mid] != a[mid+1])
                return a[mid];
            if(mid%2 == 0){
                if(a[mid] == a[mid+1])
                    low = mid+1;
                else if(a[mid] == a[mid-1])
                    high = mid-1;
            }
            else {
                if(a[mid] == a[mid+1])
                    high = mid-1;
                else if(a[mid] == a[mid-1])
                    low = mid+1;
            }
        }
        return a[mid+1];
    }
}
