import java.util.Scanner;

public class OperatorGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1-10: ");
        int num = scan.nextInt();

        if (num == 1 || num == 2)
            num++;
        else if (num >= 3 && num <= 5)
            num--;
        else if (num == 6)
            num *= 2;
        else
            num *= 3;

        System.out.println("The new number is " + num);

    }
}
