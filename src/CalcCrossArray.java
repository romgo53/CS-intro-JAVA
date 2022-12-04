public class CalcCrossArray {
    public static int rowSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];
        return sum;
    }

    public static int mainCrossSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][i];
        return sum;
    }

    public static int seconderyCrossSum(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++)
            sum += mat[i][mat.length - 1 - i];
        return sum;
    }

    public static int parimeterSum(int[][] mat) {
        int sum = rowSum(mat[0]) + rowSum(mat[mat.length - 1]);
        for (int i = 1; i < mat.length - 1; i++)
            sum += mat[i][0] + mat[i][mat.length - 1];
        return sum;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        System.out.println(rowSum(a[0]));
        System.out.println(mainCrossSum(a));
        System.out.println(seconderyCrossSum(a));
        System.out.println(parimeterSum(a));


    }
}
