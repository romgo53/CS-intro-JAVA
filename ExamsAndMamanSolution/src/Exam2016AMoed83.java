public class Exam2016AMoed83 {

    //Q2
    public static boolean findX(int[] a, int n){
        int lo1 = 0, lo2 = 1, hi1=a.length-2, hi2=a.length-1;
        if(a.length == 2)
            return a[0] + a[1] == n;
        if(a.length <2)
            return false;
        while(lo1<hi1 && lo2<hi2){
            int mid1 = (lo1+hi1)/2, mid2=(lo2+hi2)/2;
            int sum = a[mid1]+a[mid2];
            if(sum == n)
                return true;
            if(sum > n){
                if(hi1>hi2){
                    hi1-=2;
                } else {
                    hi2 -= 2;
                }
            } else {
                if(lo1>lo2)
                    lo2+=2;
                else
                    lo1+=2;
            }

        }
        return false;
    }

    public static int passingCars(int[] a){
        int pairs = 0;
        int lo=0, hi=a.length-1;
        while(lo<hi){
            return 1;
        }
        return 1;
    }

    public static void main(String[] args){
        int[] semi_sorted = {1,2,5,3,6,10,9};
        System.out.println(findX(semi_sorted, 9));
    }
}
