package Intermediate_Java_Programs;

import java.util.Scanner;

public class Find_Ncr_Npr {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Total no of items"); 
    int N = sc.nextInt();
    System.out.println("Enter no of item to choose");
    int R = sc.nextInt();

    int NCR = facto(N)/(facto(R)*facto(N - R));
    int NPR = facto(N)/facto(N - R);

    System.out.println("Combination : "+ NCR);
    System.out.println("Permutation : "+ NPR);


    }

    public static int facto(int N){
        int factorial = 1;
        for(int i = N; i > 1; i--){
            factorial = factorial * i;
        }
        return factorial;
    }
}