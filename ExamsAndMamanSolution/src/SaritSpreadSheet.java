import java.util.Arrays;

public class SaritSpreadSheet {
    public static boolean splitEqualMult(int[] a) {
        return splitEqualMult(a, 1, 1, 0);
    }

    private static boolean splitEqualMult(int[] a, int sum1, int sum2, int i) {
        if (i == a.length) {
            if (sum1 == sum2)
                return true;
            return false;
        }
        return splitEqualMult(a, sum1 * a[i], sum2, i + 1) || splitEqualMult(a, sum1, sum2 * a[i], i + 1);
    }

    public static int minDiff(int[] a) {
        return minDiff(a, 0, 0, 0);
    }

    private static int minDiff(int[] a, int sum1, int sum2, int i) {
        if (i == a.length) {
            return Math.abs(sum1 - sum2);
        }
        return Math.min(minDiff(a, sum1 + a[i], sum2, i + 1), minDiff(a, sum1, sum2 + a[i], i + 1));
    }

    public static int makeSum(int[] a, int k, int num) {
        return makeSum(a, k, num, 0);
    }

    private static int makeSum(int[] a, int k, int num, int i) {
        if (k == 0 && num >= 0) {
            return 1;
        }
        if (k < 0 || num == 0)
            return 0;
        return makeSum(a, k - a[i], num - 1, i + 1) + makeSum(a, k - a[i], num - 1, i);
    }

    public static int minPoints(int[][] m) {
        return minPoints(m, 0, 0, 0) + 1;
    }

    private static int minPoints(int[][] m, int sum, int i, int j) {
        if (!(isPointLegal(m, i, j)))
            return Integer.MAX_VALUE;

        if (i == m.length - 1 && j == m[0].length) {
            if (m[i][j] < 0)
                sum += Math.abs(m[i][j]);
            return sum;
        }
        int opt1, opt2 = 0;
        if (m[i][j] < 0)
            sum += Math.abs(m[i][j]);
        return Math.min(minPoints(m, sum, i + 1, j), minPoints(m, sum, i, j + 1));
    }

    private static boolean isPointLegal(int[][] m, int i, int j) {
        if (i >= m.length || j >= m[0].length)
            return false;
        return true;
    }

    public static int lcs(String s, String t) {
        return lcs(s, t, 0, 0, 0);
    }

    private static int lcs(String s, String t, int i, int j, int curr) {
        if (s.length() == i || t.length() == j)
            return curr;
        if (s.charAt(i) == t.charAt(j))
            return lcs(s, t, i + 1, j + 1, curr + 1);
        else {
            return Math.max(lcs(s, t, i + 1, j, curr), lcs(s, t, i, j + 1, curr));
        }
    }

    public static int longOrdNum(String s) {
        return longOrdNum(s, 0, 0, '0');
    }

    private static int longOrdNum(String s, int i, int count, char min) {
        if (i == s.length())
            return count;
        if (s.charAt(i) >= min && s.charAt(i) <= '9')
            return longOrdNum(s, i + 1, count + 1, (char) (s.charAt(i) + 1));
        if (s.charAt(i) <= '9' && s.charAt(i) >= '0')// this is a digit but not rising series
            return Math.max(count, longOrdNum(s, i + 1, 1, (char) (s.charAt(i) + 1)));
        else//not a digit
            return Math.max(count, longOrdNum(s, i + 1, 0, '0'));
    }

    public static int howManyPaths() {
        return 1;
    }

    public static void CharPath(char[][] m, char c) {
        CharPath(m, c, 0, 0, "");
    }

    private static void CharPath(char[][] m, char c, int i, int j, String s) {
        if (i < 0 || j < 0 || i > m.length - 1 || j > m[0].length - 1 || m[i][j] != c)
            return;
        if (i == m.length - 1 && j == m[0].length - 1)
            System.out.print(s);
        char tmp = m[i][j];
        m[i][j] = (char) (c + 1);
        if (i != 0 || j != 0)
            s += "->";
        CharPath(m, c, i + 1, j, s + "Down");
        CharPath(m, c, i - 1, j, s + "Up");
        CharPath(m, c, i, j + 1, s + "Right");
        CharPath(m, c, i, j - 1, s + "Left");
        m[i][j] = tmp;
    }

    public static void printPath(int[][] mat) {
        printPath(mat,0,0);
    }

    private static void printPath(int[][] mat, int i, int j) {
        System.out.print("(" +i + ", " + j + ")");
        if (i- 1 >=0) {
            if (mat[i][j] < mat[i - 1][j]) {
                printPath(mat, i - 1, j);
                return;
            }
        }
        if (j - 1 >= 0) {
            if (mat[i][j] < mat[i][j - 1]) {
                printPath(mat, i, j - 1);
                return;
            }
        }
        if (i + 1 <= mat.length - 1) {
            if (mat[i][j] < mat[i + 1][j]) {
                printPath(mat, i + 1, j);
                return;
            }
        }
        if (j + 1 <= mat[0].length - 1) {
            if (mat[i][j] < mat[i][j + 1]) {
                printPath(mat, i, j + 1);
                return;
            }
        }
    }
    public static int oneFiveSeven(int n){ return oneFiveSeven(n,0);}
    private static int oneFiveSeven(int n, int count){
        if(n==0)
            return count;
        if(n<0)
            return Integer.MAX_VALUE;
        int one = oneFiveSeven(n-1, count+1);
        int five = oneFiveSeven(n-5, count+1);
        int seven = oneFiveSeven(n-7, count+1);

        return Math.min(Math.min(one, five), seven);
        //if Math.min is not allowed
//        if(one<five)
//            return one<seven?one:seven;
//        if(one<seven)
//            return one<five?one:five;
//        return five<seven?five:seven;
    }

//    public static boolean covers(int[][] m, int[] a, int k){
//
//    }
//    private static boolean covers(int[][]m, int[]n, int k, int i){
//        if(k<0 || i> m.length-1)
//            return false;
//        if(allZero(n))
//            return true;
//
//        int[] tmp = new int[n.length];
//
//        boolean slow = covers(m,n,k,i+1);
//        tmp = copy(tmp, n);
//        xZero(n, m[i]);
//        boolean fast = covers(m,n,k-1,i+1);
//        n = tmp;
//        return slow || fast;
//    }

    public static int findMaximum(int[][] m){
        if (m[0][0] < 0)
            return 0;
        return findMaximum(m,0,0);
    }
    private static int findMaximum(int[][] m, int i, int j){

        int down=0,side=0;
        if(i%2==0){
            if(i < m.length - 1 && m[i+1][j] != -1)
                down = findMaximum(m,i+1,j);
            if(j < m[0].length - 1 && m[i][j + 1] != -1)
                side = findMaximum(m,i,j+1);
        } else {
            if(i < m.length - 1 && m[i+1][j] != -1)
                down = findMaximum(m,i+1,j);
            if(j > 0 && m[i][j - 1] != -1)
                side = findMaximum(m,i,j-1);
        }
        return m[i][j] + Math.max(down,side);
    }
    public static void findWord(char [][] arr, String word)
    {
        int[][] help = new int[arr.length][arr[0].length];
        findWord(arr, word, 0, 0, help, 1);
        printArr(help);
    }
    private static void findWord(char [][] arr, String word, int i, int j, int[][] h, int count)
    {
        if (i > arr.length - 1 || j > arr[0].length - 1)
            return;
        if (arr[i][j] == word.charAt(0)) //מילה של התחלה מצאתי
        {
            boolean result = findRest(arr, word, i, j, h, count);
            if (result)
                return;
        }
        if (j == arr[0].length - 1) //אחרונה עמודה
            findWord(arr, word, i + 1, 0, h, count);
        else
            findWord(arr, word, i, j + 1, h, count);
    }
    private static boolean findRest(char [][] arr, String word, int i, int j, int[][] h, int count) {
        if (i > arr.length - 1 || j > arr[0].length - 1 || i < 0 || j < 0)
            return false;
        else if (word.length() == 0)
            return true;
        else if (arr[i][j] == word.charAt(0)) { //במילה תו מצאתי
            char temp = arr[i][j];
            arr[i][j] = '1';
            boolean right = findRest(arr, word.substring(1), i, j + 1, h, count + 1);
            if (right) {
                h[i][j] = count;
                arr[i][j] = temp;
                return true;
            }
            boolean left = findRest(arr, word.substring(1), i, j - 1, h, count + 1);
            if (left) {
                h[i][j] = count;
                arr[i][j] = temp;
                return true;
            }
            // all were false
            arr[i][j] = temp;
            return false;
        }
        else
            return false;
    }
    public static void printArr(int[][] m){
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static int ways(int n, int k){
        if(n==0&&k==0)
            return 1;
        if(k==0)
            return 0;
        return ways(n-1,k-1) + ways(n+1,k-1);
    }




    public static void main(String[] args) {
        int[] a = {2, 15, 3, 4, 2, 5};
        int[] b = {2, 3, 4, 8, 6, 4};
        int[] c = {1, 2, 3, 4};
        int[] d = {2, 5, 10, 20, 50};
        int[][] m = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        int[][] m2 = {{3, 8, 7, 2},
                {5, 15, 2, 4},
                {12, 14, -13, 22},
                {13, 16, 17, 52}};
        int[][] findMax = {
                {1, 1, -1, 1,1},
                {1,0, 0,-1, 1},
                {1, 1, 1, 1,-1},
                {-1,-1, 1, 1, 1},
                {1,1,-1,-1,1}};

        char[][] findW = {{'t','z','x','c','d'},{'s','h','a','z','x'},{'h','w','l','o','m'},{'o','r','n','t','n'}};
        String longOrd = "x12y3348";
        int[] route = {2,8,3,4,7,1,3,2};
        char[][] chMat = {{'a', 'x', 'y', 'x', 'b'}, {'a', 'a', 'a', 'j', '*'}, {'g', 'h', 'a', 'l', 't'}, {'f', 'a', 'a', '*', '!'}, {'!', 'a', 'h', 'h', 'j'}, {'l', 'a', 'a', 'a', 'a'}};
        System.out.println(splitEqualMult(a)); // true
        System.out.println(splitEqualMult(b)); // false
        System.out.println(minDiff(c)); // 0
        System.out.println(minDiff(b)); // 1
        System.out.println(makeSum(d, 40, 4)); // 4
        System.out.println(minPoints(m)); // 8?
        System.out.println(longOrdNum(longOrd)); //3 ?
        CharPath(chMat, 'a');
        System.out.println();
        printPath(m2);
        System.out.println();
        System.out.println(oneFiveSeven(5));//1
        System.out.println(oneFiveSeven(10));//2
        System.out.println(oneFiveSeven(9));//3
        System.out.println(findMaximum(findMax));// 9?
        findWord(findW, "sha");
        System.out.println();
        System.out.println(ways(2,4)); // 4

    }

}