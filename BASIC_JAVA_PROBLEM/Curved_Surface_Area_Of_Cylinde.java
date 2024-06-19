package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Curved_Surface_Area_Of_Cylinde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius and height :");
        int r = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("Surface area :"+2*3.14*r*h);
    }
}
