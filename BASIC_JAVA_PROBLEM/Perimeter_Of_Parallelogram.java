package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Perimeter_Of_Parallelogram {
    public static void main(String[] args) {
        System.out.println("Enter side A and B :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Perimeter :" + 2*(a+b));
    }
}
