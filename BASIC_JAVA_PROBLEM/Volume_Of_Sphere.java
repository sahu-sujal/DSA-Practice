package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Volume_Of_Sphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius :");
        int r = sc.nextInt();

        System.out.println("Volume :"+ (3/4)*3.14*r*r*r);
    }
}
