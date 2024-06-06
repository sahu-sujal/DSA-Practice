package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

/**
 * Largest_bw_two_num
 */
public class Largest_bw_two_num {

    public static void main(String[] args) {
        System.out.println("enter 2 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(Math.max(a, b));
    }
}