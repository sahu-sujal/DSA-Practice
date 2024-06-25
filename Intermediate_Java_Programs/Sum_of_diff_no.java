package Intermediate_Java_Programs;

import java.util.Scanner;

public class Sum_of_diff_no {
    public static void main(String[] args) {
        System.out.println("Enter Numbers, If Terminate Press Zero !!");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();

        int Negsum = 0;
        int Poseven = 0;
        int Posodd = 0;


        while (num != 0) {
            if(num < 0){
                Negsum += num;
            }else if (num % 2 == 0) {
                Poseven += num;
            }else if (num % 2 == 1 ) {
                Posodd += num;
            }
            num = sc.nextInt();
        }

        System.out.println("Negative No sum : "+ Negsum);
        System.out.println("Positive Even No sum : "+ Poseven);
        System.out.println("Positive Odd No sum : "+ Posodd);
    }
}
