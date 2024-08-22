
package assignment1;

import java.util.Scanner;

public class Variable {

    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhap vao so thu nhat: ");
        int a = keyboard.nextInt();
        System.out.println("Nhap vao so thu hai: ");
        int b = keyboard.nextInt();
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        int g = a%b;
        System.out.println("Bai lam:\n"+ "a + b=" + c + "\n" + "a - b = " + d + "\n" + "a * b = " + e + "\n" + "a / b = " + f + "\n" + "a % b = " + g );        
    }
    
}
