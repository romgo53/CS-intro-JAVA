package Maman142017B;

public class Q2 {
    public static boolean find(int[][] mat, int x){
        int secR = mat.length/2, secCol=mat.length-1;

        while(mat[secR][secCol] != x || (secCol < mat.length-1 && secR< mat.length-1)){
            if (mat[secR][secCol] > x){
                return true;
            }
        }
        return mat[secR][secCol] == x;
    }
}
