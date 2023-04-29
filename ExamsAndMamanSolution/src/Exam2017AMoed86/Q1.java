package Exam2017AMoed86;

public class Q1 {
    public static void main(String[] args) {
        String s1 = "geek";
        String s2 = "gesek";
        String s3 = "sunday";
        String s4 = "saturday";
        System.out.println(edit(s1,s2));
        System.out.println(edit(s3,s4));
    }
    public static int edit(String s1, String s2){
        return edit(s1, s2, 0,0,0);
    }

    private static int edit(String s1, String s2, int i, int j, int count) {
        if(s1.length()-1 <= i && s2.length()-1 <= j)
            return count;
        if(s1.length()-1 == i || s2.length()==j){
            return count + Math.abs(s2.length()-s1.length());
        }
        if(s1.charAt(i) == s2.charAt(j)){
            return edit(s1,s2,i+1,j+1,count);
        }
        int op1 = edit(s1,s2,i+1,j,count+1);
        int op2 = edit(s1,s2,i,j+1,count+1);
        return Math.min(op1,op2);
    }
}
