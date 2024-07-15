package Functions;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number = number / 10;
        }

        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.println("number is palidrome");
        }else{
            System.out.println("Number is'nt palidrome");
        }
    }
}
