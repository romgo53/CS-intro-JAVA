package Exam2019AMoed85;

public class Q2 {

    public static void main(String[] args) {
        int[] a = {7,10,13,19,22,25};
        System.out.println(missingVal(a));
    }

    public static int missingVal(int[] a) {
        int low = 0, high = a.length - 1, diff = a[1] - a[0];
        int first = a[0];
        int mid = 0;
        if(diff < a[a.length-1] - a[a.length-2])
            return a[high]- diff;
        else if(a[high] - a[high-1] < diff)
            return a[0] + diff/2;

        while(low<high) {
            mid = (low+high)/2;
            if(first + (diff*(mid)) == a[mid]){
                if(a[mid]+diff != a[mid+1]) {
                    return a[mid] + diff;
                } else {
                    low = mid + 1;
                }
            } else {
                if(a[mid] - diff != a[mid-1])
                    return a[mid] - diff;
                else
                    high = mid-1;
            }

        }
        if(first + (mid*diff) == a[mid])
            return a[mid] + diff;
        return a[mid] -diff;
    }
//    public static int missingVal(int[] a){
//        if(a.length<=2)
//            return a[0] + ((a[1]-a[0])/2);
//        int diff1 = a[1] - a[0], diff2 = a[2]-a[1];
//        if(diff1!=diff2){
//            if(diff1>diff2)
//                return a[0]+diff2;
//            else
//                return a[1] + diff1;
//        }
//        return missingVal(a,diff1);
//    }
//    private static int missingVal(int[] a, int diff){
//        int lo=0,hi=a.length-1;
//        int mid;
//        while(lo<=hi){
//            mid = (hi+lo)/2;
//            if((a[mid]-a[0])/diff == mid)
//                lo = mid+1;
//            else
//                hi = mid-1;
//        }
//        return a[hi] + diff;
//    }
}
