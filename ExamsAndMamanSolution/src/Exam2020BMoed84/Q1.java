package Exam2020BMoed84;

public class Q1 {

    public static void findWord(char[][] a, String word){
        int[][] mat = new int[a.length][a.length];
        if(findWord(a,word,0,0,mat))
            printArr(mat);
        else
            System.out.println("No Such Word");
    }

    private static void printArr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean findWord(char[][] a, String word, int i, int j, int[][] m) {
        if(i>a.length-1)
            return false;
        if(j>a.length-1)
            return findWord(a,word,i+1,0,m);
        if(findWord(a,word,i,j,m,0))
            return true;
        return findWord(a,word,i,j+1,m);
    }

    private static boolean findWord(char[][] a, String word, int i, int j, int[][] m, int ind) {
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || m[i][j] != 0){
            return false;
        }
        if(ind==word.length())
            return true;

        if(word.charAt(ind) != a[i][j]){
            return false;
        }
        m[i][j] = ind+1;
        if(!findWord(a,word,i+1,j,m,ind+1)){
            if(!findWord(a,word,i-1,j,m,ind+1)){
                if(!findWord(a,word,i,j+1,m,ind+1)){
                    if(!findWord(a,word,i,j-1, m,ind+1)){
                        m[i][j] = 0;
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] c = {
                {'t','z','x','c','d'},
                {'s','h','a','z','x'},
                {'h','w','l','o','m'},
                {'a','s','g','q','a'},
                {'a','s','d','w','s'}
        };
        findWord(c,"shalom");
    }
}
