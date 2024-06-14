package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class paremeter_of_rectangle {
    public static void main(String[] args) {
        System.out.println("Enter Length and Breath : ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Perimeter of rectangle : " + 2*(l+b));
    }
}
