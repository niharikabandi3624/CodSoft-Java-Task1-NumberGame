import java.util.Random;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int totalRounds = 0;
        int roundsWon = 0;

        System.out.println("=================================================================");
        System.out.println("NUMBER GUESSING GAME");
        boolean playAgain = true;
        while ( playAgain) {
            int number = random.nextInt(100) +1;
            int attempts = 0; 
            boolean guessedCorrectly = false;
            System.out.println("\nI have selected a number between 1 and 100");
            System.out.println("Try to guess it!");
            while (attempts < 10) {
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;
                if (guess == number) {
                    System.out.println("Congratulations! You guessed it correctly!");
                    System.out.println("Number of attempts: " + attempts);
                    guessedCorrectly = true;
                    roundsWon++;
                    break;
                }
                else if(guess < number){
                    System.out.println("Too low! Try again.");
                }
                else {
                    System.out.println("Too high! Try again.");
                }
                
            }
            if(!guessedCorrectly){
                System.out.println("\n You have used all 10 attempts. ");
                System.out.println("The correct number was: " + number);
            }
            totalRounds++;
            System.out.println("\nDo you want to play another round? (yes/no):");
            String answer =sc.next();
            if (!answer.equalsIgnoreCase("yes")) {
                playAgain = false;
                
            }

            
        }
        System.out.println("=====================================================");
            System.out.println("FINAL SCORE");
            System.out.println("====================================================");
            System.out.println("Total rounds played: " + totalRounds);
            System.out.println("Rounds won: " + roundsWon);
            System.out.println("======================================================");
            System.out.println("Thank you for playing!");
            sc.close();
        
    }
}
