package bai_1;

import java.util.Scanner;

public class Bai_1 {

    public static void main(String[] args) {
        int firstNumber, secondNumber;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        firstNumber = scanner.nextInt();
        System.out.print("Input second number: ");
        secondNumber = scanner.nextInt();
        
        System.out.println("Sum: " + (firstNumber + secondNumber));
        System.out.println("Difference: " + (firstNumber - secondNumber));
        System.out.println("Product: " + (firstNumber * secondNumber));
        System.out.printf("Quotient: %.2f\n", 1.0 * firstNumber / secondNumber);
        System.out.println("Remainder: " + (firstNumber % secondNumber));
        System.out.println("The min number in 2 numbers is: " + ((firstNumber<secondNumber)?firstNumber:secondNumber));
    }
    
}
