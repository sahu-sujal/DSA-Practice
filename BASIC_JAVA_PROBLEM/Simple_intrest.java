package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Simple_intrest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int principal = sc.nextInt();
        int time = sc.nextInt();
        int rate = sc.nextInt();

        System.out.println("your simple intrest is :"+ ((principal* rate * time)/1000));
    }
}
