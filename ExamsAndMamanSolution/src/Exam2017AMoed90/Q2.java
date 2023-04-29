package Exam2017AMoed90;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {1,2,4,10,11,15};
        int[] a1 = {1,1,1,1};
        int[] a2 = {2,2,2,2};
        System.out.println(findSmallest(a));
        System.out.println(findSmallest(a1));
        System.out.println(findSmallest(a2));
    }
    public static int findSmallest(int[] arr){
        int sum = 1;
        for(int i=0;i< arr.length;i++){
            if(sum<arr[i]){
                return sum;
            }
            sum+=arr[i];
        }
        return sum;
    }
}
