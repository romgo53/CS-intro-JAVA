package src;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number between 100-999: ");
        int num = scan.nextInt();

        int hundreds = num / 100;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        System.out.println("The hundreds digit is " + hundreds);
        System.out.println("The tens digit is " + tens);
        System.out.println("The ones digit is " + ones);
    }

}
