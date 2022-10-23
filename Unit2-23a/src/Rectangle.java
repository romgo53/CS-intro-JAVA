import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        int area, perimeter, height, width;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the rectangle height: ");
        height = scan.nextInt();

        System.out.println("Enter the rectangle weight: ");
        width = scan.nextInt();

        perimeter = (height + width) * 2;
        area = height * width;

        System.out.println("The rectangle perimeter is: " + perimeter);
        System.out.println("The rectangle area is: " + area);

    }
}
