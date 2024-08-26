package new_random;

import java.util.Random;
import java.util.Scanner;

public class New_Random {

        

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();

        int points = 0;
        int wrong = 0;
        while (wrong < 3) {
            int result = play(console, rand); 
            if (result > 0) {
                points++;
            } else {
                wrong++;
            }
        }

        System.out.println("You earned " + points + " total points.");
        console.close(); // Dong Scanner de ro ri tai nguyen
    }

    public static int play(Scanner console, Random rand) {
        int numberToGuess = rand.nextInt(10) + 1; // So ngau nhien tu 1 den 10
        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = console.nextInt();

        if (userGuess == numberToGuess) {
            System.out.println("Correct! The number was " + numberToGuess);
            return 1; 
        } else {
            System.out.println("Wrong! The number was " + numberToGuess);
            return 0; 
        }
    }

    

}

