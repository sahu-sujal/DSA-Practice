package BASIC_JAVA_PROBLEM;

import java.util.Scanner;

public class factor_of_number {
    public static void main(String[] args) {
        System.out.print("Enter an number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Factor : ");
        for(int i = 1;i<= num;i++){
            if(num % i  == 0){
                System.out.println(i);
            }
        }

    }
}
