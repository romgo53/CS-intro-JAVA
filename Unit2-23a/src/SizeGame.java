import java.util.Scanner;

public class SizeGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (num < 10)
            System.out.println("Small");
        else if (num < 100)
            System.out.println("Medium");
        else if (num < 1000)
            System.out.println("Big");
        else
            System.out.println("Very big");

    }
}
