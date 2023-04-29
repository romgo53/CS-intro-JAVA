public class Exam2020Moed87 {
    // Q1
    public static int totalWays(int[][] mat, int k) {
        return totalWays(mat, k, 0, 0, 'S');
    }

    private static int totalWays(int[][] m, int k, int i, int j, char prev) {
        if (m.length - 1 == i && m[0].length - 1 == j && k == 0) {
            System.out.print("(" + i + "," + j + ")");
            System.out.println();
            return 1;
        }
        else if (m.length - 1 == i && m[0].length - 1 == j)
            return 0;
        System.out.print("(" + i + "," + j + ") ->");
        int tmp = m[i][j];
        m[i][j] = Integer.MIN_VALUE;
        int sum = 0;
        if (isLegal(m,i + 1, j)) {
            if (prev != 'D' && prev != 'S')
                sum += totalWays(m, k--, i + 1, j, 'D');
            sum += totalWays(m, k, i + 1, j, 'D');
        }
        if (isLegal(m, i, j + 1)) {
            if (prev != 'R' && prev != 'S')
                sum += totalWays(m, k--, i, j + 1, 'R');
            sum += totalWays(m, k, i, j + 1, 'R');
        }
        m[i][j] = tmp;
        return sum;
    }
    private static boolean isLegal(int[][] m, int i, int j){
        if(i>= m.length || j>=m[0].length)
            return false;
        if(m[i][j] == Integer.MIN_VALUE)
            return false;
        return true;
    }


    public static void main(String[] args){
        int[][] m = {{1,2,3},{1,2,3},{1,2,3}};
        System.out.println(totalWays(m,2));
        String s = "10";
    }
}

