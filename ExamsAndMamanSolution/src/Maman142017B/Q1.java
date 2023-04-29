package Maman142017B;

public class Q1 {
    public static int isSink(int[][] mat){
        int row = 0, col = 0, sum0=0, sum1=0;
        while(row<mat.length&&col<mat.length){
            if(mat[row][col] == 0)
                col++;
            else
                row++;
        }
        if(row==mat.length)
            return -1;
        col = row;
        for(int i=0;i<mat.length;i++){
            sum0+=mat[row][i];
            sum1=mat[i][col];
        }
        if(sum0!=0 || sum1!=mat.length-1)
            return -1;
        return row;
    }
}
