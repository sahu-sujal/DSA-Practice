package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Reverse_a_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter an number : ");
        int num = sc.nextInt();
        int reverse = 0;
        while (num != 0) {
            int temp = num % 10;
            num = num / 10;
            reverse = (reverse * 10) + temp;


        }
        System.out.println(reverse);
    }
}
