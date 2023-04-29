package Exam2022BMoed86;

public class Q2  {

    public static void main(String[] args) {
        int[] a = {35,17,13,252,4,128,7,3,81};
        sortMod(a,10);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }

    public static void sortMod(int[] a, int k){
        int i = 0;

        for(int t = 0; t<k;t++){
            for(int j = i;j<a.length;j++){
                if(a[j]%k==t){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                    i++;
                }
            }
        }
    }
}
