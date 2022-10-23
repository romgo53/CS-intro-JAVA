import java.util.Scanner;

public class PaymentCalc {
    public static void main(String[] args) {
        final int YOUNG_AND_ELDER_BONUS = 200;
        final int HEALTH_TAX_FEE = 100;
        final int MINIMUM_MIDDLE_AGE = 18;
        final int MAXIMUM_MIDDLE_AGE = 67;
        int age, salary;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        age = scan.nextInt();

        System.out.println("Enter your salary: ");
        salary = scan.nextInt();

        if (MINIMUM_MIDDLE_AGE < age && age < MAXIMUM_MIDDLE_AGE) {
            salary -= HEALTH_TAX_FEE;
        } else {
            salary += YOUNG_AND_ELDER_BONUS;
        }
        System.out.println("Your final salary: " + salary);

    }
}
