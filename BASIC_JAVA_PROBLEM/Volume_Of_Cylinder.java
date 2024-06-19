package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Volume_Of_Cylinder {
    public static void main(String[] args) {
        System.out.println("Enter radius and height");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("Volume :"+ 3.14*h*r*r);
    }
}
