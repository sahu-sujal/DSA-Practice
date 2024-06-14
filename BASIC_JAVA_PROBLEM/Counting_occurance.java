package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class Counting_occurance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enetre an long number :");
        long num = sc.nextLong();
        System.out.print("enter occurance number :");
        int ocu = sc.nextInt();

        short count = 0;
        while (num != 0){
            int temp = (int)(num  % 10) ;
            if(temp == ocu){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);

    }
}
