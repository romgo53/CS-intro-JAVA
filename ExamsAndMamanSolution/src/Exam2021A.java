public class Exam2021A {
    //Q1

    private static int median(int[] a){
        if(a.length%2 != 0)
            return a[a.length/2];
        return (a[a.length/2] + a[a.length/2 -1])/2;
    }
    public static int getMedian(int[] a, int[] b){
        int fistM = median(a), secondM = median(b);
        return (fistM+secondM)/2;
    }
    public static void main(String[] args){
        int[] a = {1,12,15,26,38};
        int[] b = {12,13,18,30,45};
        System.out.println(getMedian(a,b));
    }
}
