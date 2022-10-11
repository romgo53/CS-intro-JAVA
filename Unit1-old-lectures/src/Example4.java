import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

//        final double PI = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 100-999: ");
        int num = scan.nextInt();

        System.out.println("The hundreds digit is " + num/100 + " and the tens digit is " + (num%100)/10 + " and the ones digit is " + num%10);

    }
}
