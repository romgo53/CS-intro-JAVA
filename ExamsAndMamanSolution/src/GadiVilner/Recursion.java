package GadiVilner;

public class Recursion {
    public static boolean isIdentity(int[][] m, int x, int size) {
        return isIdentity(m, x, size, x, x);
    }

    private static boolean isIdentity(int[][] m, int x, int size, int i, int j) {
        if (i > x + size - 1)
            return true;
        if (j > x + size - 1)
            return isIdentity(m, x, size, i + 1, x);
        if (i == j && m[i][j] != 1)
            return false;
        else if (m[i][j] != 0)
            return false;
        return isIdentity(m, x, size, i, j + 1);
    }

    public static String minimalSt(String s1, String s2) {
        return minimalSt(s1, s2, "");
    }

    private static String minimalSt(String s1, String s2, String s) {
        if (s1.length() == 0)
            return s + s2;
        else if (s2.length() == 0)
            return s + s1;
        if (s1.charAt(0) == s2.charAt(0)) {
            return minimalSt(s1.substring(1), s2.substring(1), s + s1.charAt(0));
        }
        String op1 = minimalSt(s1.substring(1), s2, s + s1.charAt(0));
        String op2 = minimalSt(s1, s2.substring(1), s + s2.charAt(0));
        return op1.length() < op2.length() ? op1 : op2;

    }

    public static boolean isSum(int[] a, int n){
        return isSum(a,n,0,0);
    }

    private static boolean isSum(int[] a, int n, int i, int usedPrev) {
        if(i>=a.length)
            return false;
        if(n==0)
            return true;
        if(usedPrev == 2)
            return isSum(a,n,i+1,0);
        return isSum(a,n-a[i], i+1, usedPrev+1) || isSum(a,n,i+1,0);
    }


    public static void main(String[] args) {
//        String s1 = "AGGTAB";
//        String s2 = "GXTXAYB";
//        System.out.println(minimalSt(s1, s2));
        int[] a =  {5,4,2,1,3};

        System.out.println(isSum(a,9));



    }
}
