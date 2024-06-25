package Intermediate_Java_Programs;

import java.util.Scanner;

public class Perfect_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();

        int i = 1;
        int sum = 0;

        while (i != num) {
            if(num % i == 0){
                sum = sum + i;
            }
            i++;
        }

        if (sum == num) {
            System.out.println("It is a perfect number");
        }else{
            System.out.println("It is not a perfect number");
        }
    }
}