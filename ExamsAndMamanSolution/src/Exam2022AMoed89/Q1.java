package Exam2022AMoed89;

public class Q1 {
    public static boolean isJump(String s1, String s2, int step){
        if(s2.length() == 0) {
            return true;
        }
        if(s1.charAt(0) != s2.charAt(0) || s1.length() < s2.length()){
            return false;
        }
        return isJump(s1.substring(step), s2.substring(1), step);
    }

    public static int strStep(String s1, String s2){
        int maxStep = s1.length()/s2.length();
        if(maxStep == 0){ return -1;}
        if(s1.charAt(0) != s2.charAt(0)) { return -1; }
        return strStep(s1,s2,maxStep, 1);
    }

    private static int strStep(String s1, String s2, int maxStep, int step) {
        if(step > maxStep) { return -1; }
        if(isJump(s1,s2,step))
            return step;
        return strStep(s1,s2,maxStep,step+1);
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abcbvrcfa";

        System.out.println(strStep(s2,s1));
    }
}
