package Maman142021A;

public class Q4 {

    public static void main(String[] args) {
        boolean[][] m  = {
                {false,false,false,false,true},
                {false,true,true,true,false},
                {false,false,true,true,false},
                {true,false,false,false,false},
                {true,true,false,false,false}
        };
        System.out.println(cntTrueReg(m));
    }
    public static int cntTrueReg(boolean[][] m){
        return cntTrueReg(m,0,0,0);
    }

    private static int cntTrueReg(boolean[][] m, int i, int j, int count) {
        if(i == m.length)
            return count;
        if(j==m.length)
            return cntTrueReg(m,i+1,0,count);
        if(m[i][j]){
            turnOff(m,i,j);
            count++;
        }
        return cntTrueReg(m,i,j+1,count);
    }

    private static void turnOff(boolean[][] m, int i, int j) {
        if(i<0 || j<0 || i > m.length-1 || j > m[0].length-1 || !m[i][j]){
            return;
        }
        m[i][j] = false;
        turnOff(m,i+1,j);
        turnOff(m,i-1,j);
        turnOff(m,i,j+1);
        turnOff(m,i,j-1);
    }
}
