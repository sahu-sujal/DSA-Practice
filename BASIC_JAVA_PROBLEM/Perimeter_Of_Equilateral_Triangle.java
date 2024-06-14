package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Perimeter_Of_Equilateral_Triangle {
    public static void main(String[] args) {
        System.out.println("Enetr one side : ");
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();

        System.out.println("Perimeter : "+ 3*side);
    }
}
