package Exam2020BMoed96;

import javax.swing.plaf.BorderUIResource;

public class Q2 {

    public static void main(String[] args) {
        Range r1 = new Range(-5,-4);
        Range r2 = new Range(-7,-6);
        Range r3 = new Range(-16,-10);
        Range r4 = new Range(-22,-20);
        Range[] arr = {r4,r3,r2,r1};
        System.out.println(minimalPositive(arr));
    }
    public static int minimalPositive(Range[] arr){
        int low = 0, high = arr.length-1;
        int mid = 0;
        while(low <= high){
            mid = (low+high)/2;
            if(arr[mid].getBig() < 0)
                low = mid+1;
            else if(arr[mid].getSmall() <=0 && arr[mid].getBig() >=0)
                return 0;
            else{
                if(mid == 0 || arr[mid-1].getBig() < 0)
                    return arr[mid].getSmall();
                high = mid-1;
            }
        }
        if(arr[mid].getSmall() < 0)
            return -1;
        return arr[mid].getSmall();
    }

}