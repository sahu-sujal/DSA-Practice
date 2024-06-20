package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Distance_Between_Two_Points {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter points X1, X2, Y1, Y2 :");
    int x1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y1 = sc.nextInt();
    int y2 = sc.nextInt();

    double distance = Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));

    System.out.println("distance b/w point a and b is : " + distance);

    }
}