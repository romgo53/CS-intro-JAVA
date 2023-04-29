package Exam2016AMoed91;

public class Q2 {
    public static void main(String[] args) {
        Space s = new Space(11);
        s.getLoc();
        int[] res = findUFO(s);
        System.out.println("Loc: "  + res[0] + " , " + res[1]);
    }
    public static int[] findUFO(Space tmp){
        int xLow = 0, xHi=tmp.getSize();
        int yLow = 0, yHi=tmp.getSize();
        int xMid=0,yMid=0;
        int[] ans = tmp.ask(xMid, yMid);
        int[] loc = new int[2];
        while(ans[0] != 0||ans[1] != 0){
            xMid = (xLow+xHi)/2;
            yMid = (yLow+yHi)/2;
            ans = tmp.ask(xMid, yMid);
            if(ans[0] == 0 && ans[1] == 0) {
                loc[0] = xMid;
                loc[1] = yMid;
                return loc;
            }
            if(ans[0] == -1){
                xHi = xMid-1;
            } else if(ans[0] == 1) xLow = xMid+1;
            if(ans[1] == -1){
                yHi = yMid-1;
            } else if(ans[1] == 1) yLow = yMid+1;
        }

        return loc;
    }
}
