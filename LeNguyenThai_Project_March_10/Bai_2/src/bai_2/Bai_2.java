package bai_2;

import java.util.Scanner;

public class Bai_2 {

    public static void main(String[] args) {
        int number;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the integer you want to check: ");
        number = scanner.nextInt();
        
        System.out.printf("%d is ", number);
        if(number % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    
}
