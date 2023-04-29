package Exam2016AMoed82;

import Exam2020BMoed96.Range;

public class Q2 {
    public static void main(String[] args) {
        Range r1 = new Range(3,5);
        Range r2 = new Range(12,12);
        Range r3 = new Range(19,19);
        Range r4 = new Range(100,104);
        Range[] arr = {r1,r2,r3,r4};

        // true:
        System.out.println(isSum(arr, 22));
        System.out.println(isSum(arr, 113));
        System.out.println(isSum(arr, 202));

        // false:
        System.out.println(isSum(arr, 38));
        System.out.println(isSum(arr, 53));
    }
    public static boolean isSum(Range[] a, int x){
        int lo = 0, hi =a.length-1;
        while (lo<=hi){

            if(a[lo].getSmall() + a[hi].getSmall() <= x){

                if(a[lo].getBig() + a[hi].getBig() >= x && a[lo].getSmall()!=a[hi].getBig()) {

                    return true;
                }
                lo++;
            }
            else{
                hi--;
            }
        }
        return false;
    }
}
