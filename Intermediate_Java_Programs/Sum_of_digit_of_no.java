package Intermediate_Java_Programs;

import java.util.Scanner;

public class Sum_of_digit_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digit");
        int digit = sc.nextInt();
        int sum = 0 ;

        while(digit != 0){
            int temp = digit % 10;
            sum = sum + temp;
            digit = digit/10;
        }

        System.out.println("Sum : "+ sum);
    }
}
