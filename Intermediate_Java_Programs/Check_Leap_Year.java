package Intermediate_Java_Programs;

import java.util.Scanner;

public class Check_Leap_Year {
    public static void main(String[] args) {
        System.out.print("Enter the year : ");
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        if(Year % 4 == 0){
            System.out.println("This is leap Year");
        }else{
            System.out.println("It is not leap Year");
        }
    }
}