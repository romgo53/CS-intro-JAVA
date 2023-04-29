package WongiSim3;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(combinationSumK(3,7));
        System.out.println(combinationSumK(3,9));
        System.out.println(combinationSumK(4,1));
    }
    public static int combinationSumK(int k, int n){
        return combinationSumK(k,n,1,"", n);
    }

    private static int combinationSumK(int k, int n, int i, String s, int num) {
        if(n<0) return 0;
        if(i>=num)
            return 0;
        if(k==0){
            if(n==0){
                System.out.println(s.substring(0,s.length()-1)+"="+num);
                return 1;
            }
            return 0;
        }
        return combinationSumK(k-1,n-i, i+1, s+i+"+", num) + combinationSumK(k,n, i+1,s,num);
    }
}
