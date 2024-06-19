package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Discount_Of_Product {
    public static void main(String[] args) {
        System.out.println("Enter original price and discount percentage :");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        int Dper = sc.nextInt();

        float dispric = (op*Dper)/100;

        System.out.println("you got the discount of : "+ dispric);
    }
}
