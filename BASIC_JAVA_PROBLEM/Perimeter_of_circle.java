package BASIC_JAVA_PROBLEM;

import java.net.Socket;
import java.util.Scanner;

public class Perimeter_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter Radius of Circle : ");
        int radius = sc.nextInt();
        System.out.println("Perimeter : "+ 2*3.14*radius);
    }
}
