import java.util.Scanner;

public class IsSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        System.out.println("Enter the length of 4 sides: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();

        if (a==b && b==c && c==d) {
            System.out.println("The square is a square");
        } else {
            System.out.println("The square is not a square");
        }

    }
}
