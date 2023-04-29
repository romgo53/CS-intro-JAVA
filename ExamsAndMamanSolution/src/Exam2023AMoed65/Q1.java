package Exam2023AMoed65;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(countPairs(3));
    }
    public static int countPairs(int n){
//        return countPairs(n, n,"");
        return countPairs(n-1,n,"(");
    }

    private static int countPairs(int open, int close, String s) {
        if(open==0&&close==0){
            System.out.println(s);
            return 1;
        }
        if(open==0)
            return countPairs(open, close-1, s+")");
        if(open>=close)
            return countPairs(open-1,close, s+"(");

        return countPairs(open-1, close, s+"(") + countPairs(open,close-1,s+")");
    }

//    private static int countPairs(int open, int close, String curr) {
//        if(open<0|| close<0)
//            return 0;
//        if(open==0&&close==0) {
//            System.out.println(curr);
//            return 1;
//        }
//        int countOpen=0, countClose=0;
//        if(open>=close){
//            countOpen = countPairs(open-1,close, curr+'(');
//        } else {
//            countOpen = countPairs(open-1, close, curr+'(');
//            countClose = countPairs(open, close-1, curr+')');
//        }
//        return countClose+countOpen;
//    }
}
