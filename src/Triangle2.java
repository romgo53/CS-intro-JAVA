import java.util.Scanner;

/*
 * Triangle1
 * The Triangle2 class receives tree lengths and checks whether these lengths can be a triangle
 * If so it will print the type of the triangle (equilateral, isosceles, right-angle or common)
 *
 * Author: Rom Waidergoren
 * Version: 23/10/2022
 */
public class Triangle2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program gets tree lengths and checks whether these lengths can be a triangle"
                + "and if so it will print the type of the triangle. ");
        System.out.println("Please enter the three lengths"
                + " of the triangle's sides");
        int x = scan.nextInt();
        int y = scan.nextInt();
        int z = scan.nextInt();
        // Checks if the triangle is valid
        if (x + y > z && x + z > y && z + y > x){
            if (x==y && y==z)
                System.out.println("The numbers: X, Y and Z represent an equilateral triangle");
            else if(x==y || y==z || z==x)
                System.out.println("The numbers: X, Y and Z represents a isosceles triangle");
        } else
            System.out.println("The numbers: X, Y and Z cannot represent a triangle");

    }
}
