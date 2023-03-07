package bai_5;

import java.util.Scanner;

public class Bai_5 {

    public static void main(String[] args) {
        int number, sum = 0;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Tổng là " + sum + " chưa lớn hơn 100");
            System.out.print("Nhập số nguyên: ");
            number = scanner.nextInt();
        }while((sum += number) < 100);
        System.out.println("Tổng là " + sum + " lớn hơn 100");

    }
    
}
