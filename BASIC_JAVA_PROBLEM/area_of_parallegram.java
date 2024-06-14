package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class area_of_parallegram {
    public static void main(String[] args) {
        System.out.println("Enter the base and height");
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Area of paralleogram : " + b*h);
    }
}
