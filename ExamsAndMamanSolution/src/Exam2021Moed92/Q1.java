package Exam2021Moed92;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {1,3,6,2};
        System.out.println(printExp(a, 4));
    }
    public static int printExp(int[] a, int num){
        return printExp(a,num,"",0);
    }

    private static int printExp(int[] a, int n, String exp, int i) {
        if(i==a.length){
            if(n==0){
                System.out.println(exp);
                return 1;
            } else
                return 0;
        }
        if(n==0){
            System.out.println(exp);
            return 1;
        }
        return printExp(a,n-a[i], exp+"+"+a[i], i+1) + printExp(a,n+a[i], exp+"-"+a[i], i+1) + printExp(a,n,exp,i+1);
    }

}
