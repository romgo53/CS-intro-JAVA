package Exam2016AMoed91;

import java.util.Random;

public class Space {
    protected boolean[][] _space;
    protected int _i;
    protected int _n;
    protected int _j;

    public Space(int n){
        _space = new boolean[n][n];
        Random rnd = new Random();
        _i = rnd.nextInt(n);
        _n = n;
        _j = rnd.nextInt(n);
        _space[_i][_j] = true;
    }

    public void getLoc(){
        System.out.println("(" + _i +  ", " + _j + ")");
    }
    public int getSize() {
        return _n;
    }
    public int[] ask (int x,int y){
        int[] res = new int[2];
        if(x<_i)
            res[0] = 1;
        else if(x>_i)
            res[0] = -1;
        else
            res[0] = 0;
        if(y<_j)
            res[1] = 1;
        else if(y>_j)
            res[1] = -1;
        else
            res[1] = 0;
        return res;
    }
}
