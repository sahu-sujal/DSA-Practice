package Intermediate_Java_Programs;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        System.out.println("enter an number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int arm= 0;
        
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            int digit = temp % 10;
            temp = temp/10;
            arm = arm +(digit * digit * digit);
        }
        
        if(num == arm){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("number is not armstrong");
        }
    }
}
