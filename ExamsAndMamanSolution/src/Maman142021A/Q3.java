package Maman142021A;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(solutions(5));
    }
    public static int solutions(int n) {
        if (3 > n || n > 30)
            return 0;
        int[] s = {1,1,1};
        return solutions(n, s, 0);
    }

    private static int solutions(int n, int[] sol, int i) {
        if(i>sol.length-1)
            return 0;
        int sum = sol[0] + sol[1] + sol[2];
        if(sol[i] > 10){
            sol[i] = 1;
            return 0;
        }
        if(sum == n){
            System.out.println(sol[0] + "+" + sol[1] + "+" + sol[2]);
            sol[i] = 1;
            return 1;
        }
        int a = solutions(n, sol, i+1);
        sol[i]++;
        int b = solutions(n,sol,i);
        return a+b;
    }

}
