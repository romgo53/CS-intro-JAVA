public class Pyramid {

    public static void main(String[] args){
        int last = 5;
        for(int i=1;i<=6;i++){
            for(int j=0;j<last;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            last--;
            System.out.println();

        }
    }

}
