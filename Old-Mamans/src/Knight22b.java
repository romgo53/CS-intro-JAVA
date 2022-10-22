import java.util.Scanner;

public class Knight22b {

    public static void main(String[] args) {

        // Board limitations
        final int MAX_SIZE = 8;
        final int MIN_SIZE = 1;
        // Knight possible moves
        final int ONE_STEP = 1;
        final int TWO_STEPS = 2;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the number of row");
        int row = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col = scan.nextInt();



        if (row < 1 || row > MAX_SIZE || col < 1 || col > MAX_SIZE) {
            System.out.println("Input is illegal");
        } else {
            System.out.println("Moves");
            if (row + TWO_STEPS <= MAX_SIZE && col + ONE_STEP <= MAX_SIZE) {
                System.out.println((row + TWO_STEPS) + "," + (col + ONE_STEP));
            }
            if (row + TWO_STEPS <= MAX_SIZE && col - ONE_STEP >= MIN_SIZE) {
                System.out.println((row + TWO_STEPS) + "," + (col - ONE_STEP));
            }
            if (row + ONE_STEP <= MAX_SIZE && col + TWO_STEPS <= MAX_SIZE) {
                System.out.println((row + ONE_STEP) + "," + (col + TWO_STEPS));
            }
            if (row + ONE_STEP <= MAX_SIZE && col - TWO_STEPS >= MIN_SIZE) {
                System.out.println((row + ONE_STEP) + "," + (col - TWO_STEPS));
            }
            if (row - TWO_STEPS >= MIN_SIZE && col + ONE_STEP <= MAX_SIZE) {
                System.out.println((row - TWO_STEPS) + "," + (col + ONE_STEP));
            }
            if (row - TWO_STEPS >= MIN_SIZE && col - ONE_STEP >= MIN_SIZE) {
                System.out.println((row - TWO_STEPS) + "," + (col - ONE_STEP));
            }
            if (row - ONE_STEP >= MIN_SIZE && col + TWO_STEPS <= MAX_SIZE) {
                System.out.println((row - ONE_STEP) + "," + (col + TWO_STEPS));
            }
            if (row - ONE_STEP >= MIN_SIZE && col - TWO_STEPS >= MIN_SIZE) {
                System.out.println((row - ONE_STEP) + "," + (col - TWO_STEPS));
            }

        }
    }

}
