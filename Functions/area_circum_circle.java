package Functions;

import java.util.Scanner;

public class area_circum_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        area_circle(radius);
        circumference_circle(radius);
    }

    static void area_circle(int rad){
        System.out.println("the area is : " + 2*3.14*rad);
    }

    static void circumference_circle(int rad){
        System.out.println("the circumference is : " + rad*3.14*rad);
    }
}
