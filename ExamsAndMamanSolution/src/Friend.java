public class Friend {

    public static int friends3(int[][] mat){
        if(mat.length == 3) {
            if (isTriple(mat, 0, 1, 2)) {
                System.out.println(0 + " " + 1 + " " + 2);
                return 1;
            }
            return 0;
        }
        if(mat.length <3)
            return 0;
        return friends3(mat,0,1,2,0);

    }
    private static int friends3(int[][] m, int first, int second, int third, int count){
        if(first == m.length-1-2){
            if(isTriple(m,first,second,third)){
                System.out.println(first + " " + second + " " + third);
                return count + 1;
            }
            return count;
        }
        if(second == m.length-1){
            return friends3(m,first+1,first+2,first+3, count);
        }
        if(third == m.length){
            return friends3(m,first, second+1,second+2, count);
        }
        if(isTriple(m,first,second,third)){
            System.out.println(first + " " + second + " " + third);
            return friends3(m,first,second,third+1,count+1);
        }
        return friends3(m,first,second,third+1,count);
    }
    private static boolean isTriple(int[][] mat, int i, int j, int k) {
        return mat[i][j] == 1 && mat[i][k] == 1 && mat[j][k] == 1;
    }

    public static void main(String[] args) {
        int [][] m ={
                {0,1,1,1},
                {1,0,1,1},
                {1,1,0,1},
                {1,1,1,0}
        };
        System.out.println(friends3(m));
    }
}
