package BASIC_JAVA_PROBLEM;
import java.util.Scanner;

public class area_of_circle {
    public static void main(String[] args) {
        System.out.print("Enter radius :");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        float  area = (float) (3.14 * radius * radius);
        System.out.println("The area of circle is : " + area);
    }
}