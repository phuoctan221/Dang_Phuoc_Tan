
package random_1to100;

import java.util.Random;

public class Random_1to100 {

    public static void main(String[] args) {
        
        Random rand= new Random();
        int rand1 = rand.nextInt(100)+1;
        System.out.println("Random: "+rand1);
        
        System.out.println("--------- END ----------");
        int tries = 0;
        int sum = 0;
        
        while (sum != 7) {
            int roll1 = rand.nextInt(6) + 1;
            int roll2 = rand.nextInt(6) + 1;
            sum = roll1 + roll2;
            System.out.println(roll1 + " + " + roll2 + " = " + sum);
            tries++;
        }

        System.out.println("You won after " + tries + " tries!");
    }
    
}
