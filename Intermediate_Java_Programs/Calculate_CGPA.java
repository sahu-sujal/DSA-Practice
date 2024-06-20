package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0 ;
        for(int i = 1; i<=8; i++){
            System.out.print("Enter "+ i + " semester sgpa :");
            float temp = sc.nextFloat();
            sum = sum + temp;
        }

        System.out.println("your CGPA is : " + sum/8);
    }
}
