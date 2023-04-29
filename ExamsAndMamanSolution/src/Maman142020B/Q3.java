package Maman142020B;

public class Q3 {

    public static void main(String[] args) {
        System.out.println(count("subsequence", "sue"));
    }

    public static int count(String st, String pt){
        return count(st, pt, 0,0);
    }

    private static int count(String st, String pt, int stInd, int ptInd) {
        if(ptInd == pt.length())
            return 1;
        if(stInd == st.length())
            return 0;
        if(st.charAt(stInd) == pt.charAt(ptInd)){
            return count(st,pt,stInd+1, ptInd+1) + count(st,pt,stInd+1, ptInd);
        } else {
            return count(st,pt, stInd+1, ptInd);
        }
    }
}
