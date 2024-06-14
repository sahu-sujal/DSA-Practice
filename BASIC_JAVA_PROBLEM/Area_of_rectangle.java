package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Area_of_rectangle {

    public static void main(String[] args) {
        System.out.println("Enter Length and Breath");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Area : "+ l*b);
    }
}