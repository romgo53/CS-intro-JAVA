public class Exam2016BMoed87 {
    // Q1
    public static int countSets(int sum) {
        return countSets(sum, 1);
    }

    private static int countSets(int sum, int start) {
        if (sum == 0) {
            return 1;
        }
        if (start > sum) {
            return 0;
        }
        return countSets(sum - start, start + 1) + countSets(sum, start + 1);
    }
    // Q2 A
    public static int subStrC(String s, char c){
        return 4;
    }


    public static  void main(String[] args){
        System.out.println(countSets(5));
    }
}
