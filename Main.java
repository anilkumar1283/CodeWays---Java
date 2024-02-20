import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int min = 1;
        int max = 100;
        int rounds = 0;
        int score = 0;
        int maxAttempt = 10;
        System.out.println("Welcome to the Number Guessing Game!");
        while (true) {
            int targetNum = random.nextInt(max - min + 1) + min;
            int attempt = 0;
            System.out.println("Round " + (rounds++) + ":Guess the number between " + min + " and" + max);
            while (attempt < maxAttempt) {
                System.out.println("Enter your guess: ");
                int guess = sc.nextInt();
                attempt++;

                if (guess == targetNum) {
                    System.out.println("Congrats " + attempt + "attempts");
                    score += maxAttempt - attempt + 1;
                    break;
                } else if (guess < targetNum) {
                    System.out.println("Too low! Try again");
                } else {
                    System.out.println("Too high try again");
                }
            }
            System.out.println("Do you want to continue again? (yes/no): ");
            String playAgain = sc.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Game over... Your total score is : " + score);
                break;
            }

        }
        sc.close();
    }
}