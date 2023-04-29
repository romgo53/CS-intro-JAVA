package Exam2023AMoed65;

import javax.sound.midi.Soundbank;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {2,3,8,27};
        System.out.println(superInc(a, 5));

    }

    public static boolean superInc(int[] a, int k){
        for (int i = a.length-1; i >= 0 && k > 0;i--) {
            if(k >= a[i])
                k-=a[i];
        }
        return k==0;
    }
//    public static boolean superInc(int[] a, int k){
//        int hi = a.length-1, lo = 0, res, mid=0;
//        while(lo<=hi){
//            mid=(lo+hi)/2;
//            if(a[mid] == k)
//                return true;
//            else if(a[mid] > k){
//                hi = mid-1;
//                if (a[hi] < k) {
//                    break;
//                }
//            } else lo = mid+1;
//        }
//        int diff = Math.abs(a[mid] - k);
//        System.out.println(diff);
//        hi = mid-1;
//        lo=0;
//        while(lo<=hi){
//            mid = (lo+hi)/2;
//            if(a[mid] == diff)
//                return true;
//            else if(a[mid]<diff){
//                lo=mid+1;
//            } else hi=mid-1;
//        }
//        return false;
//    }
//
//    public static boolean hasSubarrayWithSum(int[] arr, int num) {
//        int start = 0;
//        int end = 0;
//        int currentSum = arr[0];
//        while (start < arr.length && end < arr.length) {
//            if (currentSum == num) {
//                return true;
//            } else if (currentSum < num) {
//                end++;
//                if (end < arr.length) {
//                    currentSum += arr[end];
//                }
//            } else {
//                currentSum -= arr[start];
//                start++;
//            }
//            if (start > end) {
//                end = start;
//                currentSum = arr[start];
//            }
//        }
//        return currentSum == num;
//    }

}
