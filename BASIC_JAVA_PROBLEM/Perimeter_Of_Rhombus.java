package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Perimeter_Of_Rhombus {
    public static void main(String[] args) {
        System.out.println("Enter the side :");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        System.out.println("Perimeter :" + 4*side);
    }
}
