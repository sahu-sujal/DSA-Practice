package Intermediate_Java_Programs;

import java.util.Scanner;

public class Future_Investment {
    public static void main(String[] args) {
        System.out.println("Enter Principal, Rate and Years");
        Scanner sc = new Scanner(System.in);
        int Principal = sc.nextInt();
        int Rate = sc.nextInt();
        int Time = sc.nextInt(); 

        System.out.println("in future you investment will be : " + Principal * Math.pow(1 + Rate, Time));
    }
}
