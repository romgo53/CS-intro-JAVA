package Maman142021B;

public class Q4 {

    public static void main(String[] args) {
        int[] a = {3,2,4,1};
        int[] b = {2,4,3,1};

        System.out.println(isPermutation(a,b));
        System.out.print("{" + b[0]);

        for (int i = 1; i < b.length; i++) {
            System.out.print(", " + b[i]);
        }
        System.out.print("}");

    }
    public static boolean isPermutation(int[] a, int[] b){
        if(a.length != b.length)
            return false;
        return isPermutation(a,b,0,0);
    }

    private static boolean isPermutation(int[] a, int[] b, int i, int j) {
        if(i==a.length)
            return true;
        if(j==b.length)
            return false;
        int tmp = b[j];
        if(a[i] == b[j]){
            b[j] = -1;
            boolean res2 = isPermutation(a,b,i+1,0);
            b[j] = tmp;
            return res2;
        }
        return isPermutation(a,b,i,j+1);

    }
}
