package Maman142022A;

public class Q2 {
    public static void main(String[] args) {
        int[][] m = {
                {1,3,7,9},
                {6,4,11,15},
                {36,50,21,22},
                {60,55,30,26}
        };
        System.out.println(search(m, 22));
    }
    public static boolean search(int[][] mat, int num)
    {
        int sqrSize = mat.length;
        //If the number is smaller or larger than smallest or largest number in the array
        if(num > mat[sqrSize-1][0] || num < mat[0][0])
        {
            return false;
        }
        int optRow = 0;
        int optCol = 0;
        while(sqrSize > 1)
        {
            //The minimum number in each square
            int minS1 = mat[0+optRow][0+optCol];
            int minS2 = mat[0+optRow][(sqrSize/2)+optCol];
            int minS3 = mat[sqrSize/2+optRow][sqrSize/2+optCol];
            int minS4 = mat[sqrSize/2+optRow][0+optCol];
            //The maximum number in each square
            int maxS1 = mat[(sqrSize/2)-1+optRow][0+optCol];
            int maxS2 = mat[(sqrSize/2)-1+optRow][sqrSize/2+optCol];
            int maxS3 = mat[sqrSize-1+optRow][sqrSize/2+optCol];
            int maxS4 = mat[sqrSize-1+optRow][0+optCol];
            if(num > maxS2)
            {
                //The number is in square 4
                if(num > maxS3)
                {
                    optRow = (sqrSize/2) + optRow;
                    optCol = +optCol;
                }
                else
                {
                    //The number is in square 3
                    optRow = (sqrSize/2) + optRow;
                    optCol = (sqrSize/2) + optCol;
                }
            }
            else
            {
                //The number is in square 2
                if(num >maxS1)
                {
                    optRow =  +optRow;
                    optCol = (sqrSize/2) + optCol;
                }
                else
                {
                    //The number is in square 1
                    optRow = optRow;
                    optCol = optCol;
                }
            }
            sqrSize = sqrSize/2;
        }
        //If the number found
        if( mat[optRow][optCol] == num)
        {

            return true;
        }else{
            return false;
        }
    }
}
