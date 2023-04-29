package Exam2018AMoed91;

public class Q1 {

    public static void main(String[] args) {
        int[] route = {2, 8, 3, 4, 7, 1, 3, 2};
        System.out.println(cheapestRoute(route));

    }

    public static int cheapestRoute(int[] s) {
        return cheapestRoute(s, 0, 0);
    }

    private static int cheapestRoute(int[] s, int i, int sum) {
        if (i > s.length - 1)
            return Integer.MAX_VALUE;
        if (i == s.length - 1)
            return sum + s[i];
        return Math.min(cheapestRoute(s, i + 1, sum + s[i]), cheapestRoute(s, i + 2, sum + s[i]));
    }
//Option B
//    private static int cheapestRoute(int[] s, int i, int sum, boolean visited){
//        if(i>s.length-1)
//            return Integer.MAX_VALUE;
//        if(i==s.length-1)
//            return sum+s[i];
//        if(!visited)
//            return cheapestRoute(s,i+1,sum+s[i], true);
//        return Math.min(cheapestRoute(s,i+1,sum+s[i], true), cheapestRoute(s,i+1,sum,false));
//
//    }
}
