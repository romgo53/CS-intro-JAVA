package Exam2019BMoed86;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {19,19,16,15,15,15,15,13,5};
        int[] b = {0,12,13,14,14,15,15,19,25,30,35};
        System.out.println(meetingPoint(a,b));
    }
    public static int meetingPoint(int[] a, int[] b){
        int low = 0, mid=0,minInd=0;
        int high = Math.min(a.length-1, b.length-1);
        while(low<=high){
            mid = (low+high)/2;
            if(a[mid] == b[mid]) {
                minInd = mid;
                high = mid - 1;
            } else if (a[mid] > b[mid]) {
                low = mid+1;
            } else high = mid-1;
        }
        return minInd;
    }
}
