import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = scan.nextInt();

        if (num > 0) {
            if (num % 2 == 0)
                System.out.println("Number is even!");
            else
                System.out.println("Number is Odd");
        } else
            System.out.println("Wrong Number!");

    }
}
