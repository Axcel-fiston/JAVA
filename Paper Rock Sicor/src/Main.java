import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"Paper", "Rock", "Scissor"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String personalMove;

            while (true) {

                System.out.println("Enter your move : Paper , Rock , Scissor ");
                personalMove = scanner.nextLine();
                if (personalMove.equals("Paper") || personalMove.equals("Rock") ||
                        personalMove.equals("Scissor")) {
                    break;
                }
                System.out.println(personalMove + " Is not a valid move");
            }
            System.out.println("Computer played " + computerMove);

            if (personalMove.equals(computerMove)) {
                System.out.println("tie game");
            }

            else if (personalMove.equals("Paper")) {
                if (computerMove.equals("Rock")) {
                    System.out.println("You win");

                } else if (computerMove.equals("Scissor")) {
                    System.out.println("you loose");
                }
            }

            else if (personalMove.equals("Rock")) {
                if (computerMove.equals("Paper")) {
                    System.out.println("You lose");

                } else if (computerMove.equals("Scissor")) {
                    System.out.println("you win");
                }
            }

            else if (personalMove.equals("Scissor")) {
                if (computerMove.equals("Rock")) {

                    System.out.println("You loose");
                } else if (computerMove.equals("Paper")) {
                    System.out.println("you loose");
                }
            }

            System.out.println("Play again ?");
            String playAgain = scanner.nextLine();

            if (!playAgain.equals("yes")) {
                break;
            }
        }
    }
}