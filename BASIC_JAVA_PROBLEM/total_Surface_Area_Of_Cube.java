package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class total_Surface_Area_Of_Cube {
    public static void main(String[] args) {
        System.out.println("Enter side :");
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        System.out.println("Total surface area :"+6*s*s);
    }
}
