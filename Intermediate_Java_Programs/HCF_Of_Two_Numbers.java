package Intermediate_Java_Programs;

import java.util.Scanner;

public class HCF_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int HCF = 1;
        while (A != 1 & B != 1) {
            int i = 2;
            for(i = 2; i <= A | i <= B; i++){

                if (A % i == 0 & B % i == 0) {
                    HCF = HCF * i;
                    A /= i;
                    B /= i;
                    break;
                }else if (A % i == 0) {
                    A /= i;
                    break;
                }else if (B % i == 0) {
                    B /= i;
                    break;
                }

            }
        }

        System.out.println("The HCF of the value is : " + HCF);
    }
}
