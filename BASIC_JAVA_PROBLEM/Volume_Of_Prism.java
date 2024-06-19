package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Volume_Of_Prism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base and Height");
        int b = sc.nextInt();
        int h = sc.nextInt();

        float basearea = (1/2)*b*h;

        System.out.println("Volume :" + basearea*h);
    }
}
