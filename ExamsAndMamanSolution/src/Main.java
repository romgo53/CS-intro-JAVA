// Exam 2022b Moed 96B Q1 and Q2
public class Main {
    public static int calc(int num, int res, int maxOp){
        return calc(num, res, maxOp, num, "" + num);
    }
    private static int calc(int num, int res, int maxOp, int val, String op){
        if(res == val){
            System.out.println(op + " = " + res);
            return 1;
        }
        if(maxOp == 0)
            return 0;
        return calc(num, res, maxOp - 1, val + num, op +" +" + num) + calc(num, res, maxOp - 1, val - num, op +" -" + num) + calc(num, res, maxOp - 1, val * num, op +" *" + num) + calc(num, res, maxOp - 1, val / num, op +" /" + num);

    }

    public static int kAlmostSearch(int[] a, int num){
        int low = 0, high = a.length-1, mid;
        while(low<=high){
            mid = (low+high)/2;
            if(a[mid] == num)
                return mid;
            if(a[mid] == 0){
                int temp = mid;
                while (a[temp] == 0)
                    temp++;
                if(a[temp] > num) {
                    while (a[mid] == 0)
                        mid--;
                }
                else
                    mid = temp;
                if(a[mid] == num)
                    return mid;

            }
            if(a[mid] < num)
                low = mid + 1;
            if(a[mid] > num)
                high = mid -1;
        }
        return -1;
    }

//    public static void main(String[] args) {
//        // write a func that finds a number in the array below
//        int[] a = {3,0,0,4,7,9,0,0,0,0,11,15,0,19,20,0,0,31,40,0};
//        System.out.println(kAlmostSearch(a, 7));
//
//    }

}