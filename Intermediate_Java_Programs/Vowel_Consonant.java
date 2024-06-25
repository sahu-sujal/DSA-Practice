package Intermediate_Java_Programs;

import java.util.Scanner;

public class Vowel_Consonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Word :");
        char word = sc.next().charAt(0);
        String str = "AEIOUaeiou";
        if(str.indexOf(word) >= 0){
            System.out.println("it is a vovel");
        }else{
            System.out.println("It is consonant");
        }

    }
}
