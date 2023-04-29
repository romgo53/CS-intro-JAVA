package Exam2022BMoed91;

public class Q1 {
    public static void main(String[] args) {
        int[] s = {2,4,8,3,10,1,12,3,2};
        System.out.println(cheapRt(s,3,2,4));
    }
    public static int cheapRt(int[] stations, int step1, int step2, int limit){
        return cheapRt(stations, step1, step2, limit, 0, 0, "");
    }

    private static int cheapRt(int[] s, int s1, int s2, int lim, int i, int p, String r) {
        if(i > s.length-1)
            return Integer.MAX_VALUE;
        if(i==s.length-1){
            p+=s[i];
            System.out.println(r+ " " + i +" = " + p);
            return p;
        }
        if(lim == 0)
            return cheapRt(s,s1,s2,lim,i+s1,p+s[i], r+" " + i);

        int op1 = cheapRt(s,s1,s2,lim,i+s1,p+s[i], r+" " + i);
        int op2 = cheapRt(s,s1,s2,lim-1,i+s2,p+s[i], r+" " + i);
        return Math.min(op1,op2);
    }
}
