package Intermediate_Java_Programs;

import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal amount : ");
        int principal = sc.nextInt();

        System.out.print("Enter annual rate : ");
        int rate = sc.nextInt()/100;

        System.out.print("Enter the number of times that interest is compounded per unit t : ");
        int n = sc.nextInt();

        System.out.print("Enter the time : ");
        int t = sc.nextInt();

        double compound_intrest = principal * Math.pow((1 + (rate/n)), n*t); 
        System.out.println("your intrest is : "+ compound_intrest);
    }

}
