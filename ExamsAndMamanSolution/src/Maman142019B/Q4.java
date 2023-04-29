package Maman142019B;

public class Q4 {
    public static void main(String[] args) {
        int m[][] = {
                {5,41,3,14},
                {2,1,24,7},
                {3,15,10,54},
                {63,22,2,5}
        };
        int [][] path = new int[4][4];
        System.out.println(isPath(m,4,path));
        for (int i = 0; i < path.length; i++) {
            for (int j = 0; j < path[0].length; j++) {
                System.out.print(path[i][j] + ", ");
            }
            System.out.println();
        }
    }
    public static boolean isPath(int[][] m, int sum, int[][] path){
        return isPath(m, sum, path, 0,0);
    }

    private static boolean isPath(int[][] m, int sum, int[][] path, int i, int j) {
        if(i>m.length-1)
            return false;
        if(j==m[0].length)
            return isPath(m,sum,path, i+1, 0);
        if(m[i][j] == sum){
            path[i][j] = 1;
            return true;
        }
        if(m[i][j] < sum){
            if(checkPath(m,sum,path,i,j)){
                return true;
            }
        }
        return isPath(m,sum,path,i,j+1);
    }

    private static boolean checkPath(int[][] m, int sum, int[][] path, int i, int j) {
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || path[i][j] == 1){
            return false;
        }
        if(sum == 0){
            return true;
        }
        path[i][j] = 1;
        if(!checkPath(m,sum-m[i][j], path,i+1,j)){
            if(!checkPath(m,sum-m[i][j], path, i-1,j)){
                if(!checkPath(m,sum-m[i][j], path, i,j+1)){
                    if(!checkPath(m,sum-m[i][j], path, i,j-1)){
                        path[i][j]=0;
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
