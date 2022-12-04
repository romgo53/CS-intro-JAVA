public class FindTwoMin {
    public static void sortPositive(int[] a){
        int min1, min2;
        min1 = a[0];
        min2 = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min1){
                min2=min1;
                min1=a[i];
            }
            else if(a[i]<min2)
                min2=a[i];
        }

    }
}
