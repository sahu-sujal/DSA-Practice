package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class odd_N_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num%2 == 0){
            System.out.println("No is even");
        }else{
            System.out.println("No is add");
        }
    }
}
