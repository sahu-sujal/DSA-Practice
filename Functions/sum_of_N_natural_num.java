package Functions;

import java.util.Scanner;

public class sum_of_N_natural_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sum_of_natural_num(N);
    }

    static void sum_of_natural_num(int N){
        int sum = 0;
        for (int i = 0; i <= N; i++) {
            sum = sum + i; 
        }
        System.out.println("The Sum of N Natural number is : "+ sum);
    }
}
