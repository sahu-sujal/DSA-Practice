package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Fibonacci_no {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the position No: ");
        int nth = sc.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i =2; i <=nth; i++){
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
