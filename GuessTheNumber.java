import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int maxAttempts = 5;
        int maxRange = 100;
        int rounds = 3;
        int totalScore = 0;
        Scanner scanner = new Scanner(System.in);

        for (int round = 1; round <= rounds; round++) {
            int attempts = 0;
            int score = 0;
            int number = (int) (Math.random() * maxRange) + 1;
            System.out.println("Round " + round + ": I'm thinking of a number between 1 and " + maxRange + ". Can you guess it?");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                if (guess == number) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    score += maxAttempts - attempts + 1;
                    break;
                } else if (guess > number) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you have run out of attempts. The number was " + number + ".");
            }

            System.out.println("Your score for this round is: " + score);
            totalScore += score;
        }

        System.out.println("Your total score is: " + totalScore);
    }
}
