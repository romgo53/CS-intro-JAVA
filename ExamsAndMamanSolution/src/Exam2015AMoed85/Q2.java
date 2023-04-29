package Exam2015AMoed85;

public class Q2 {
    public static void main(String[] args) {
        int[] a1 = {-8,-7,-3,-2,5,8};
        int[] a2 = {-8,-7,-3,-2,7,8};
        int[] a3 = {-8,-7,-3,-2,-1,1};
        System.out.println(splitTo3(a1));
        System.out.println(splitTo3(a2));
        System.out.println(splitTo3(a3));
    }
    public static boolean splitTo3(int[] a){
        int l1=0,l2=a.length-2;
        int sum = 0, sl1=a[l1], sl2=a[l2+1];
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        sum-=sl1+sl2;
        while(l1<l2&&sl1<0 && sl2>0){
            if(sum==0)
                return true;
            if(sum>0) {
                l2--;
                sl2+=a[l2+1];
                sum-=a[l2+1];
            }
            else {
                l1++;
                sl1+=a[l1];
                sum-=a[l1];
            }
        }
        if((sl1>0 || sl2<0) && sum==0)
            return true;
        return false;
    }
}
