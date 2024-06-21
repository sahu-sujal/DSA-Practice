package Intermediate_Java_Programs;

import java.util.Scanner;

public class Reverse_A_String {
    public static void main(String[] args) {
        System.out.println("Enter an String");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reverse = new String();

        for(int i = str.length()-1; i >=0 ; i--){
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reverse : " + reverse);
    }
}
