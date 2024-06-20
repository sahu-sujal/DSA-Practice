package Intermediate_Java_Programs;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        System.out.println("Enter the number and its power :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();

        int pow = num;

        while (power != 1) {
            pow = pow * num ;
            power--;
        }

        System.out.println("the power of no is :"+pow);
    }
}
