package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Commission_Percentage {
    public static void main(String[] args) {
        System.out.println("Enter total no of sale and commusion rate");
        Scanner sc = new Scanner(System.in);
        int comrate = sc.nextInt();
        int totsale = sc.nextInt();

        double commission = (comrate/100)*totsale;

        System.out.println("The commission as per sale :" + commission);
    }
}
