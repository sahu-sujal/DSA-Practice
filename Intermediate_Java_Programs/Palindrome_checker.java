package Intermediate_Java_Programs;

import java.util.Scanner;

public class Palindrome_checker {
    public static void main(String[] args) {
        System.out.println("Enter an String");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String reverse = " ";

        for(int i = word.length()-1; i >= 0 ; i--){
            reverse = reverse.trim() + word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println("word is palindrome");
        }else{
            System.out.println("word isn't palindrome");
        }
    }
}
