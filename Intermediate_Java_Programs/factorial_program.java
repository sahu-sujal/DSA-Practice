package Intermediate_Java_Programs;

import java.util.Scanner;

public class factorial_program {
    public static void main(String[] args) {
        System.out.println("Enter an Number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int factorial = 1;

        for (int i = n; i > 0; i--) {
            factorial = factorial * i;
        }

        System.out.println("The factorial of number is : "+factorial);

    }
}
