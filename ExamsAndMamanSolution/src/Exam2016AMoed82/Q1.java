package Exam2016AMoed82;

public class Q1 {
        public static void main(String[] args) {
            int[] a = { 5, 6 ,1, 3,2,-1,8};
// 		System.out.println(where(a));
            int[] a1 = {1,2,2,1,3,2,1,3,4,-1,3,3};
            int[] a2 = {1,2,2,1,3,2,1,3,4,-1,4,2};
            System.out.println(isBal(a1,3));
            System.out.println(isBal(a2,2));
        }
        public static int where(int[] vec){
            return where(vec,0,1,vec.length-1);
        }
        private static int where(int[] a, int l, int p, int r){
            if(p <= 0 || p > r) return -1;
            int sl = sum(a,l,p-1), sr = sum(a,p,r);
            // System.out.println(sl);
            // System.out.println(sr);
            if(sl==sr) return p;
            else return where(a,l,p+1,r);
        }
        public static int sum(int[] a, int lo, int hi){
            int sum = 0;
            for(int i=lo;i<=hi;i++) sum+=a[i];
            return sum;
        }

        public static boolean isBal(int[] a, int k){
            int p = where(a);
//            System.out.println(p);
            if(p==-1) return false;
            return isBal(a,k,0,a.length-1);
        }
        private static boolean isBal(int[] a, int k, int l, int r){
            if(k==0) return true;
            int p=where(a,l,l+1,r);

//            System.out.println("p2: " + p);
            if(p==-1) return false;
            return isBal(a,k-1,l,p-1) && isBal(a,k-1,p,r);
        }
    }
