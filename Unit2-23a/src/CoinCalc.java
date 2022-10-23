package src;

import java.util.Scanner;

public class CoinCalc {
    public static void main(String[] args) {
        int coins_of_ten, coins_of_one, coins_of_five, money_in_shakels;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of Shakels you wish to covert to coins");
        money_in_shakels = scan.nextInt();
        coins_of_ten = money_in_shakels / 10;
        coins_of_five = money_in_shakels % 10 / 5;
        coins_of_one = money_in_shakels % 5;

        System.out.println("We need " + coins_of_ten + " coins of 10 NIS");
        System.out.println("We need " + coins_of_five + " coins of 5 NIS");
        System.out.println("We need " + coins_of_one + " coins of 1 NIS");

    }
}
