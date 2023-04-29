public class Exam2022aMoed91B {
    //Q1
    public static int cheapRt(int [] s, int step1, int step2, int limit){
        return cheapRt(s,step1,step2,limit, 0,0,   "");
    }

    private static int cheapRt(int[] s, int s1, int s2, int l, int i, int sum, String o) {
        if (i == s.length - 1 && l >= 0) {
            sum += s[i];
            o += " " + i + " = " + sum;
            System.out.println(o);
            return sum;
        }
        if(i>=s.length || l <0){
            return Integer.MAX_VALUE;

        }
        int curr = s[i];
        int opt1 = cheapRt(s,s1,s2,l,i+s1,sum+curr, o+ " " + i);
        int opt2 = cheapRt(s,s1,s2,l--,i+s2,sum+curr, o+ " " + i);

        return Math.min(opt1,opt2);
    }

//    public static int findTriplet(int[] arr){
//         int first, second,last;
//         // find the biggest positive num in the array since on of the tripled has to be positive
//        first = arr[0];
//        for(int i=0;i<arr.length;i++)
//            first = Math.max(first, arr[i]);
//
//
//    }
    public static void main(String[] args){
        int[] a = {2,4,8,3,10,1,12,3,2};
        System.out.println(cheapRt(a,3,2,4));
    }
}
