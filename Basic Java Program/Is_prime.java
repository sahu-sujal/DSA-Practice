package BASIC_JAVA_PROBLEM;

import java.util.*;

public class Is_prime {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);

        long num = sc.nextLong();
        int count = 0;
        int i = 2;
        while (i <= Math.sqrt(num)) {
            System.out.println("i = " + i);
            if(num % i == 0){
                System.out.println("number is not prime");
                count++;
                break;
            }
            i++;
        }
        if(count == 0){
            System.out.println("number is prime");
        }
    }    
}