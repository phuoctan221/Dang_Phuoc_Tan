package random_homework;

import java.util.Random;
import java.util.Scanner;

public class Random_HomeWork {

    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int score = 0;
        int incorrectCount = 0;

        while (incorrectCount < 3) {
            // Generate a random number of terms between 2 and 5
            int numTerms = random.nextInt(4) + 2;
            int sum = 0;

            // Build the problem string
            StringBuilder problem = new StringBuilder();
            for (int i = 0; i < numTerms; i++) {
                int number = random.nextInt(10) + 1; // Number between 1 and 10
                sum += number;
                problem.append(number);
                if (i < numTerms - 1) {
                    problem.append(" + ");
                }
            }
            problem.append(" = ");

            // Display the problem
            System.out.print(problem.toString());
            int userAnswer = scanner.nextInt();

            // Check the user's answer
            if (userAnswer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The answer was " + sum);
                incorrectCount++;
            }
        }

        // Show final score
        System.out.println("You earned " + score + " total points.");
        scanner.close();

    }


}
