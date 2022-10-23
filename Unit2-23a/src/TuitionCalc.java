package src;

import java.util.Scanner;

public class TuitionCalc {
    public static void main(String[] args) {
        final int SENIOR_COURSE_FEE = 1539, JUNIOR_COURSE_FEE= 2079, SECURITY_FEE = 59, EXTRA_LESSONS_FEE=301;
        final int WARRIOR_DISCOUNT = 50, EX_SOLIDER_DISCOUNT = 10;
        final int SUMMER_SEMESTER_FEE =286;
        int course_price = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the your seniority level: ");
        switch (scan.nextInt()) {
            case 1 -> course_price = JUNIOR_COURSE_FEE;
            case 2 -> course_price = SENIOR_COURSE_FEE;
            default -> {
                break;
            }
        }
        System.out.println("Enter your army status: ");
        switch (scan.nextInt()) {
            case 1 -> course_price *= (double) (100 - WARRIOR_DISCOUNT) / 100;
            case 2 -> course_price *= (double) (100 - EX_SOLIDER_DISCOUNT) / 100;
            default -> {
                break;
            }
        }
        System.out.println("Enter if you took the extra lessons: ");
        if (scan.nextInt() == 2)
            course_price += EXTRA_LESSONS_FEE;

        System.out.println("Enter weather or not it's a summer semester: ");
        if (scan.nextInt() == 2)
            course_price += SUMMER_SEMESTER_FEE;

        System.out.println("The total price is: " + course_price);
    }
}
