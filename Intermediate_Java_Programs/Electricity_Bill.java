package Intermediate_Java_Programs;

import java.util.Scanner;

public class Electricity_Bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Energy Consumption and rate per charge");
        int EC = sc.nextInt();
        int Rpc = sc.nextInt();

        System.out.println("Your bill is :"+ (EC*Rpc));
    }
}