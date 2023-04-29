public class Exam2022Moed86B {
    //Q1
    public static int maxPath(int[][] mat){
        return maxPath(mat, 0 , 0);
    }
    private static int maxPath(int[][] m, int i, int j){
        if(i==m.length -1 && j==m[0].length - 1)
            return m[i][j];
        int dig = getDig(m[i][j]), tens = getTens(m[i][j]);
        int first=0, second=0;
        if(isLegal(m, i+dig, j+tens))
            first = m[i][j] + maxPath(m,i+dig,j+tens);
        if(isLegal(m, i+tens, j+dig))
            second = m[i][j] + maxPath(m, i+tens, j+dig);
        else
            return Integer.MIN_VALUE;
        return Math.max(first, second);
    }
    private static int getDig(int n) { return n%10; }
    private static int getTens(int n) { return n/10; }
    private static boolean isLegal(int[][] m, int i, int j){
        if(i >= m.length || j>=m[0].length)
            return false;
        return true;
    }
    /**
     * Q2
     *
     */
    public static void sortMod(int[] a, int k) {
        sortMod(a, k, 0, a.length-1);
    }
    private static void sortMod(int[] a, int k, int lo, int hi){
        if (lo < hi){
            int m = partition(a,k, lo, hi);
            sortMod(a,k,lo, m-1);
            sortMod(a,k,m+1,hi);
        }
    }

    private static int partition(int[] a, int k, int lo, int hi){
        int left = lo, right  = hi;
        int pivot = a[lo]%k;
//        int pivot = a[lo];
        while(left<right){
            while(left<right && a[left]%k <= pivot)
//            while(left<right && a[left] <= pivot)
                left++;
            while(a[right]%k > pivot)
//            while(a[right] > pivot)
                right--;
            if(left<right)
                swap(a,left,right);
        }
        swap(a,lo,right);
        return right;
    }

    private static void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args){
//        int[][] m = {{12,22,23,54,11},{43,35,21,20,30},{34,23,43,22,30},{25,31,2,20,34},{10,22,10,11,10},{40,13,3,1,23}};
//        System.out.println(maxPath(m));
        int[] a = {35,17,13,252,4,128,7,3,81};
//        for(int i=0;i<a.length;i++)
//            a[i] = a[i]%10;


        sortMod(a, 10);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i] + ", ");
    }
}
