package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Simple_calculator {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = Sc.nextInt();
        int b = Sc.nextInt();

        System.out.println("Enter Operator");
        char c = Sc.next().trim().charAt(0);

        switch (c){
            case '+' :
                System.out.println("Addition :" + (a+b));
                break;
            case '-' :
                System.out.println("Addition :" + (a-b));
                break;
            case '*' :
                System.out.println("Addition :" + (a*b));
                break;
            case '/' :
                System.out.println("Addition :" + (a/b));
                break;
        }
    }
}
