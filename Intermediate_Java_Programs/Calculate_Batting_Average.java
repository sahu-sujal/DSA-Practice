package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Batting_Average {
    public static void main(String[] args) {
        System.out.println("Enter total no of runs and no of times out");
        Scanner sc =new Scanner(System.in);
        int total_runs = sc.nextInt();
        int nTO = sc.nextInt();

        System.out.println("Average batting : " + (int)(total_runs/nTO));

    }
}
