package BASIC_JAVA_PROBLEM;

import java.util.Scanner;
public class Volume_Of_Cone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius and height");
        int r = sc.nextInt();
        int h = sc.nextInt();
        float PI = 3.14f;

        System.out.println("Volume : "+(1/3)*PI*r*r*h);
    }
}