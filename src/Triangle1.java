
import java.util.Scanner;
/*
 * Triangle1
 * The Triangle1 class receives the lengths of the three sides of a triangle from the user and
 * prints the perimeter and area of the triangle.
 * Written by: Rom Waidergoren,  22/10/2022
 */
public class Triangle1 {
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);
        System.out.println ("This program calculates the area "
                + "and the perimeter of a given triangle. ");
        System.out.println ("Please enter the three lengths"
                + " of the triangle's sides");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int perimeter = a + b + c;
        // Implementing Heron's formula to calculate the area of a triangle
        double s = (double) perimeter / 2;
        double area = Math.sqrt(s * ((s - a) * (s - b) * (s - c)));

        System.out.println ("The length of the triangle sides are: " + a + "," + b + "," + c + ".");
        System.out.println ("The perimeter of the triangle is: " + perimeter);
        System.out.println ("The area of the triangle is: " + area);
    }
}

