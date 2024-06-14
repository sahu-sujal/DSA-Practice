package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class largest_no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Three Number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a ;

        if(b > max){
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
    
}