package Exam2022BMoed91;

public class Q2 {
    public static void main(String[] args) {
        int[] a = {-4,1,-8,9,6};
        System.out.println(findTriplet(a));
    }
    public static int findTriplet(int[] a){
        int secPosInd=0, secNegInd=0,firstInd=0,third=0,val=0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] > a[firstInd]){
                firstInd = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(i != firstInd && a[secPosInd] < a[i]){
                secPosInd = i;
            }
            if(a[secNegInd] > a[i]){
                secNegInd = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] < 0 && i!=secNegInd) {
                if (val < a[secNegInd] * a[i]) {
                    val = a[secNegInd] * a[i];
                    third = a[i];
                }
            }
            if(a[i] > 0 && i!=secPosInd && i!=firstInd){
                if(val<a[secPosInd]*a[i]){
                    val=a[secPosInd]*a[i];
                    third = a[i];
                }
            }
        }
        if(third < 0){
            System.out.println(a[firstInd] + " " + a[secNegInd] + " " + third);
            return a[firstInd] * a[secNegInd] * third;
        } else {
            System.out.println(a[firstInd] + " " + a[secPosInd] + " " + third);
            return a[firstInd] * a[secPosInd] * third;
        }
    }
}
