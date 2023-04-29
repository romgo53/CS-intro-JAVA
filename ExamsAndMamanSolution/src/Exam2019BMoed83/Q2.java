package Exam2019BMoed83;

import java.util.Timer;
import java.util.function.Function;

public class Q2 {

    public static void main(String[] args) {
        int[][] mat = {
                {-99,-72,-64,-55,-28,-10,-5},
                {-72,-53,-46,-38,11,13,22},
                {-63,-48,-27,-12,14,16,23},
                {-44,-29,-10,0,18,20,35},
                {0,12,14,20,28,30,35}
        };
    }

    public static int howManyNegativeNumbers(int[][] mat){
        int i=0, j=mat[0].length-1, count = 0;
        while(i< mat.length && j > -1){
            if(mat[i][j] < 0){
                count+=j+1;
                i++;
            } else
                j--;
        }
        return count;
    }
}
