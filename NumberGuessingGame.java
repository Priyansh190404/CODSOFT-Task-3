// import java.util.*;
// class rangen{
//     public int generate(int max,int min){
//         return(int)(Math.random()*(max-min+1)+min);
    
//     }
// }

// public class number{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         rangen rg=new rangen();
//         int totalAttempts=0;
//         int win=0;
//         while(true){
//             System.out.println("Enter the maximum number");
//             int max=sc.nextInt();
//             System.out.println("Enter the minimum number");
//             int min=sc.nextInt();
//             sc.nextLine();
//             int cnum=rg.generate(max,min);
//             int attempts=0;

//             while(true){
//                 System.out.println("Guess a number between "+max+ "and"+min);
//                 int gnum=sc.nextInt();
//                 attempts++;

//                 if (gnum>cnum){
//                     System.out.println("Its Greater");
//                 }
//                 else if (gnum<cnum){
//                     System.out.println("Its Smaller");
                
//                 }
//                 else{
//                     System.out.println("Correct guess");
//                     win++;
//                     break;
//                 }

//             }
//             totalAttempts+=attempts;
//             System.out.println("Attempts="+attempts);
//             System.out.println(("Wins="+win));


//         }

//     }
// }


import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int maxAttempts = 5;
        int score = 0;
        boolean playAgain;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            int numberToGuess = random.nextInt(100) + 1;
            int attemptsLeft = maxAttempts;
            boolean guessedCorrectly = false;

            System.out.println("Guess a number between 1 and 100. You have " + maxAttempts + " attempts to guess it.");

            while (attemptsLeft > 0 && !guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                attemptsLeft--;

                if (userGuess == numberToGuess) {
                    guessedCorrectly = true;
                    score += attemptsLeft + 1; // Add remaining attempts to score
                    System.out.println("Congratulations! You guessed the correct number.");
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }

                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("Sorry, you've used all your attempts. The number was " + numberToGuess + ".");
            }

            System.out.print("Do you want to play again? (yes/no): ");
            playAgain = scanner.next().equalsIgnoreCase("yes");

        } while (playAgain);

        System.out.println("Game over! Your final score is: " + score);
        scanner.close();
    }
}
