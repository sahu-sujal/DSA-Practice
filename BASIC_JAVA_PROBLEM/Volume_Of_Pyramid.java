package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Volume_Of_Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter Base and height of squre piraymid :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("Volume :"+ (1/3)*b*b*h);
    }
}
