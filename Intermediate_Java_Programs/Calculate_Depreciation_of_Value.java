package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Depreciation_of_Value {
    public static void main(String[] args) {
        System.out.println("Enter initial value, Rate and Time :");
        Scanner sc = new Scanner(System.in);
        int IV = sc.nextInt();
        int Rate = sc.nextInt();
        int time = sc.nextInt();

        double depreciation = IV * Math.pow((1-Rate)/100, time);

        System.out.println("the depreciation as per rate and time : "+ depreciation);
    }
}
