package bai_6;

import java.util.Scanner;

public class Bai_6 {

    public static void main(String[] args) {
        int number, factorial = 1;
        
        System.out.print("Nhập 1 số nguyên dương bất kỳ: ");
        Scanner scanner = new Scanner(System.in);
        
        number = scanner.nextInt();
        
        int temp = number;
        
        for(int i = number; number > 0; number--) {
            factorial *= number; 
        }
        
        System.out.println("Lũy thừa " + temp + " là: " + factorial);
    }
    
}
