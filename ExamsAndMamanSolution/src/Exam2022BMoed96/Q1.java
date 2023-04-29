package Exam2022BMoed96;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(calc(3,36,4));
    }
    public static int calc(int num, int result, int maxOp){
        return calc(num,result,maxOp,""+num, num);
    }

    private static int calc(int n, int res, int maxOp, String s, int val) {
        if(maxOp == 0){
            if(res == val){
                System.out.println(s + " = " + res);
                return 1;
            }
            return 0;
        }
        if(res == val){
            System.out.println(s + " = " + res);
            return 1;
        }
        return calc(n, res, maxOp-1, s + " + " + n, val+n) + calc(n, res, maxOp-1, s + " - " + n, val-n) +
                calc(n, res, maxOp-1, s + " * " + n, val*n) + calc(n, res, maxOp-1, s + " / " + n, val/n);
    }
}
