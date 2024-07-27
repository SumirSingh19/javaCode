package Assignment1;

import java.util.Scanner;

public class PenGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pens you want to play with: ");
        int pens = sc.nextInt();

        System.out.println("Here you are playing a Game with Computer!!!");
        System.out.println("You can only take 1, 2, or 3 pen(s) at a time.");
        System.out.println("Whoever will pick the last pen(s) will be the winner of the game");

        // If the initial number of pens is not a multiple of 4, computer goes first to make it a multiple of 4
        if (pens % 4 != 0) {
            int computerCount = pens % 4;
            pens -= computerCount;
            System.out.println("Computer starts and takes " + computerCount + " pens.");
            System.out.println("Remaining pens: " + pens);
        }

        while (pens > 0) {
            // User's turn
            System.out.println("This is your turn. Choose the number of pens:");
            int userCount = sc.nextInt();

            while (userCount < 1 || userCount > 3) {
                System.out.println("Invalid input. You can only choose 1 to 3 pens.");
                userCount = sc.nextInt();
            }

            pens -= userCount;
            System.out.println("This is the total count of the pens remaining: " + pens);

            if (pens == 0) {
                System.out.println("User won the game!!");
                break;
            }

            // Computer's turn
            System.out.println("Now computer will play the Game!!");

            int computerCount = (pens % 4 == 0) ? 1 : pens % 4;
            pens -= computerCount;
            System.out.println("Computer takes " + computerCount + " pens.");
            System.out.println("Remaining pens: " + pens);

            if (pens == 0) {
                System.out.println("Computer won the Game!!");
                break;
            }
        }
        sc.close();
    }
}

