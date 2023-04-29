package Maman142020A;

public class Q1 {
    public static void main(String[] args) {
        System.out.println(subStrC("abcbcabcacabcc", 'c'));
        System.out.println(subStrMaxC("abcbcabcacabcc", 'c', 1  ));
    }
    public static int subStrC(String s, char c){
        int cCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == c)
            cCount++;
        }
        return cCount - 2;
    }

    public static int subStrMaxC(String s, char c, int k){ // "cacacacac" k=1
        int count=0, cCount=0, adder = 0;
        for (int i = 0; i < s.length(); i++) {
            if (adder > k)
                adder = k;
            if (cCount > 0){
                if (s.charAt(i) == c){
                    count += adder + 1;
                    adder++;
                }
            } else {
                if (s.charAt(i) == c){
                    cCount++;
                }
            }

        }
        return count;
    }
}
