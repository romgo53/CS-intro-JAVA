import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("how many people? : ");
        int group = scan.nextInt();

        System.out.println("how many kids?: ");
        int kids = scan.nextInt();

        double present= (double)kids/group*100;
//        System.out.println(first + " / " + second + " = " + (first+second));
        System.out.println("the kids are " + present + "% of the group");

    }
}
