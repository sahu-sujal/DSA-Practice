package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class area_triangle {
    public static void main(String[] args) {
        System.out.println("Enter breath and height :");
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();

        float area = (float)(1/2*h*b);

        System.out.println("the area of triangle is : "+area);
    }
}
