package Exam2017AMoed86;

public class Q2 {
    public static int countTriplets(int[] arr, int num){
        int count= 0;
        for (int i = 0; i < arr.length-2; i++) {
            int j = i+1, k=arr.length-1;
            while(j<k){
                if(num <= arr[i] + arr[j] + arr[k])
                    k--;
                else {
                    count += (k-j);
                    j++;
                }
            }
        }
        return count;
    }
}
