import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

//        final double PI = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius: ");
        double r = scan.nextDouble();

        double area = Math.PI * Math.pow(r, 2);
        System.out.println("The area is " + area );

    }
}
