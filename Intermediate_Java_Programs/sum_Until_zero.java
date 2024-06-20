package Intermediate_Java_Programs;

import java.util.Scanner;

public class sum_Until_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter all the number you want to sum");
        int num = sc.nextInt();
        int temp = 1;
        while(num !=0 && temp !=0){
            temp = sc.nextInt();
            num = num + temp;
        }
        System.out.println(num);
    }
;
}