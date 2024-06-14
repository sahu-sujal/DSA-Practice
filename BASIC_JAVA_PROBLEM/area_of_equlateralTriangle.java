package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class area_of_equlateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one side of Eqitriangle : ");
        int A = sc.nextInt();

        float area = (float)(Math.sqrt(3)/4)*A*A;
        System.out.println("Area of eqitriangle :" + area);
    

    }
}
