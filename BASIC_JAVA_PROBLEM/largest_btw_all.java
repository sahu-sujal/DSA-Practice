package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class largest_btw_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 1;
        while (num!=0 && temp !=0) {
            temp = sc.nextInt();
            if (temp > num) {
                num = temp;
            }
        }
        System.out.println(num);
    }
}
