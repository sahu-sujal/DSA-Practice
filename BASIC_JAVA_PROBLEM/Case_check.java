package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0);

        if( ch >= 'a' && ch <= 'z'){
            System.out.println("It is lower case");
        }else {
            System.out.println("It is in upper case");
        }
    }
}
