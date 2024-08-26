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
            
            int numTerms = random.nextInt(4) + 2;
            int sum = 0;
            String problem = "";

            for (int i = 0; i < numTerms; i++) {
                int number = random.nextInt(10) + 1;
                sum += number;

                if (i > 0) {
                    problem += " + ";
                }
                problem += number;
            }
            problem += " = ";

            System.out.print(problem);
            int userAnswer = scanner.nextInt();

            if (userAnswer == sum) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! The answer was " + sum);
                incorrectCount++;
            }
        }

        System.out.println("You earned " + score + " total points.");
        scanner.close();

    }


}
