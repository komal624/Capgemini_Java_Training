package CoreProgramming.JavaStrings;

import java.util.Scanner;

/*
 * This program implements Rock-Paper-Scissors game
 * between a user and the computer.
 * It shows the winner of each game and total wins.
 */
public class Game {

    /*
     * Generates random choice for computer
     */
    public static String computerChoice() {
        int r = (int) (Math.random() * 3);

        if (r == 0) return "rock";
        if (r == 1) return "paper";
        return "scissors";
    }

    /*
     * Finds winner based on game rules
     */
    public static String winner(String user, String comp) {

        if (user.equals(comp)) return "Draw";

        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("paper") && comp.equals("rock")) ||
                (user.equals("scissors") && comp.equals("paper"))) {
            return "User";
        }

        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userWins = 0;
        int compWins = 0;

        System.out.print("Enter number of games: ");
        int games = sc.nextInt();

        for (int i = 0; i < games; i++) {
            System.out.print("Enter choice (rock/paper/scissors): ");
            String user = sc.next();

            String comp = computerChoice();
            String win = winner(user, comp);

            System.out.println("Computer: " + comp + " | Winner: " + win);

            if (win.equals("User")) {
                userWins++;
            } else if (win.equals("Computer")) {
                compWins++;
            }
        }

        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);

        sc.close();
    }
}
