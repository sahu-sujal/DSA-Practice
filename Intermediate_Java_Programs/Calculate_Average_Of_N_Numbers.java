package Intermediate_Java_Programs;

import java.util.Scanner;

public class Calculate_Average_Of_N_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //solution 1

        System.out.println("Enter no of element to enter");
        int N = sc.nextInt();

        int arr[] = new int[N];
        System.out.println("Enter element Value: ");
        for(int i = 0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int avg = 0;
        for(int i =0; i<N; i++){
            avg = avg + arr[i];
        }

        System.out.println("the average of number is : "+ avg/N);


        //soultion 2

        System.out.println("Enter no of element to enter");
        int n = sc.nextInt();
        int i = 0;
        int Avg = 0;
        System.out.println("Enter element Value: ");
        while (i != n) {
            int temp = sc.nextInt();
            Avg = Avg + temp;
            i++;
        }
        System.out.println("the average of number is : "+ Avg/n);

    }
}
