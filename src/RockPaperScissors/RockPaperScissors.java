package RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Player 1: Rock, Paper, Scissors");
        String player1 = scanner.nextLine();

        System.out.println("Player 2: Rock, Paper, Scissors");
        String player2 = scanner.next();

        String result = rockPaperScissors(player1, player2);
        System.out.println(result);
    }


        public static String rockPaperScissors (String player1, String player2){

            player1 = player1.toLowerCase();
            player2 = player2.toLowerCase();

            if (player1.equals(player2)) {
                return "TIE";
            }

            switch (player1) {
                case "rock":
                    switch (player2) {
                        case "scissors":
                            return "Player 1 wins";
                        case "paper":
                            return "Player 2 wins";
                    }
                    break;

                case "paper":
                    switch (player2) {
                        case "rock":
                            return "Player 1 wins";
                        case "scissors":
                            return "Player 2 wins";
                    }
                    break;
                case "scissors":
                    switch (player2) {
                        case "paper":
                            return "Player 1 wins";
                        case "rock":
                            return "Player 2 wins";
                    }
                    break;
            }
            return "Invalid input";
        }
}
