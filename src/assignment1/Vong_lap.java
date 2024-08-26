
package vong_lap;

import java.util.Scanner;


public class Vong_lap {


    public static void main(String[] args) {
        for(int i=1;i<=6;i++)
        {
            System.out.println(i + " squared = " + (i*i)); 
        }
        System.out.println("-------------------------------");
        for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= 10; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------");
        for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println("-------------------------------");
        for (int i = 1; i <= 5; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print(i);
            }
            System.out.println();
        }
        System.out.println("-------------------------------");
        Scanner console = new Scanner(System.in);
        int sum = 0;
        System.out.print("Enter a number (-1 to quit): ");
        int number = console.nextInt();
        while (number != -1) {
            sum = sum + number; 
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
        }
        System.out.println("The total is " + sum);
    }
}
