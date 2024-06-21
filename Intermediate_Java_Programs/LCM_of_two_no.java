package Intermediate_Java_Programs;

import java.util.Scanner;

public class LCM_of_two_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two number :");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int LCM = 1;

        while (A != 1 | B != 1) {

            int i = 2;
            for(i = 2 ; i <= A | i <= B; i++){
                if( A % i == 0 & B % i == 0){
                    LCM = LCM * i;
                    A /= i;
                    B /= i;
                    break;
                }else if(A % i == 0){
                    LCM = LCM * i;
                    A /= i;
                    break;
                }
                else if(B % i == 0){
                    LCM = LCM * i;
                    B /= i;
                    break;
                }
            }
            
        }

        System.out.println("The LCM is :" + LCM);
    }
}
