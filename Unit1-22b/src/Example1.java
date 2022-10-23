package src;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first integer: ");
        int first = scan.nextInt();

        System.out.println("Enter the second integer: ");
        int second = scan.nextInt();

        int sum = first + second;
        System.out.println(first + " + " + second + " = " + (first+second));

    }
}
