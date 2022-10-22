import java.util.Scanner;

public class Chess22b {
    public static void main(String[] args) {

        // Board limitations
        final int MAX_SIZE = 8;
        final int MIN_SIZE = 1;
        // Knight possible moves
        final int ONE_STEP = 1;
        final int TWO_STEPS = 2;

        final String FIRST_CHESSMAN_NAME;
        final String SECOND_CHESSMAN_NAME;

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the type" + " of the first chessman");
        char first = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row1 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col1 = scan.nextInt();
        System.out.println("Please enter the type" + " of the second chessman");
        char second = scan.next().charAt(0);
        System.out.println("Please enter the number of row");
        int row2 = scan.nextInt();
        System.out.println("Please enter the number of column");
        int col2 = scan.nextInt();

        switch (first) {
            case 'k' -> FIRST_CHESSMAN_NAME = new String("Knight");
            case 'b' -> FIRST_CHESSMAN_NAME = new String("bishop");
            case 'r' -> FIRST_CHESSMAN_NAME = new String("rock");
            default -> FIRST_CHESSMAN_NAME = new String("");
        }
        switch (second) {
            case 'k' -> SECOND_CHESSMAN_NAME = new String("Knight");
            case 'b' -> SECOND_CHESSMAN_NAME = new String("bishop");
            case 'r' -> SECOND_CHESSMAN_NAME = new String("rock");
            default -> SECOND_CHESSMAN_NAME = new String("");
        }

        if (row1 > MAX_SIZE || row2 > MAX_SIZE || row2 < MIN_SIZE || row1 < MIN_SIZE) {
            System.out.println("Position is illegal");
        } else if (col1 > MAX_SIZE || col2 > MAX_SIZE || col2 < MIN_SIZE || col1 < MIN_SIZE) {
            System.out.println("Position is illegal");
        } else if (first == second) {
            System.out.println("Chessmen should be different from each other");
        } else if (row1 == row2 && col1 == col2) {
            System.out.println("Chessmen should be in different positions");
        } else {
            if (first == 'r' || second == 'r') {
                if (row1 == row2 || col1 == col2) {
                    if (first == 'r') {
                        System.out.println(FIRST_CHESSMAN_NAME + " threatens " + SECOND_CHESSMAN_NAME);
                    } else {
                        System.out.println(SECOND_CHESSMAN_NAME + " threatens " + FIRST_CHESSMAN_NAME);
                    }
                }
            }
            if (first == 'b' || second == 'b') {
                if (Math.abs(row1-row2) == Math.abs(col1-col2)) {
                    if (first == 'b') {
                        System.out.println(FIRST_CHESSMAN_NAME + " threatens " + SECOND_CHESSMAN_NAME);
                    } else {
                        System.out.println(SECOND_CHESSMAN_NAME + " threatens " + FIRST_CHESSMAN_NAME);
                    }
                }
            }

        }


    }
}