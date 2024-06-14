package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class area_of_rombus {
    public static void main(String[] args) {
        System.out.println("Enter the diagonals of rhombus :");
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        System.out.println("Area of Rhombus : " + (d1*d2)/2);
    }
}
