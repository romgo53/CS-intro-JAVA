public class Exam2023BMoed57 {
    // Q1
    public static int selectPrimes(int n, int x){
        return selectPrimes(n,x, 2,1,"",0,1);
    }

    private static int selectPrimes(int n, int x, int curr, int streak, String s, int count, int sum) {
        if (curr >= n) return 0;
        if(sum > n){ return 0;}
        if(sum==n){
            if(streak==x){
                count++;
                s+=curr+", ";
            }
            if(count==0) return 0;
            System.out.println(s);
            return count;
        }
        if(streak==x){
            count++;
            s+=curr+", ";
            return selectPrimes(n,x,curr, 0, s, count, sum);
        }
        return selectPrimes(n,x,curr,streak+1, s, count, sum*curr) + selectPrimes(n,x,nextPrime(curr), 0, s, count, sum);

    }

    private static int nextPrime(int num) {
        boolean flag = false;
        while(!flag){
            num++;
            flag = isPrime(num);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] a = {10,3,40,20,50,80,70};
        System.out.println(findAlmostSorted(a, 50));
    }
    private static boolean isPrime(int num) {
        for (int i = 2; i < num ; i++) {
            if(num%i==0)
                return false;
        }
        return true;
    }

    public static int findAlmostSorted(int[] arr, int n){
        int lo=0,hi=arr.length-1;
        int mid =0;
        while(lo<=hi){
            mid = (lo+hi)/2;
            if(arr[mid] == n) return mid;
            if(arr[mid] < n){
                if(mid>0&&arr[mid-1]==n)
                    return mid-1;
                lo=mid+1;
            } else {
                if(mid<arr.length-1&&arr[mid+1] == n) return mid+1;
                hi=mid-1;
            }
        }
        return -1;
    }
}
// 2*3*