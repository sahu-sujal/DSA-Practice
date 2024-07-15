package Functions;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factorial(num);
    }
    static void factorial(int num){
        int sum = 1;
        System.out.print(num + "! = ");
        for(int i = num; i >= 2; i--){
            System.out.print(i+" * ");
            sum = sum * i;
        }
        System.out.print(" 1 = "+ sum);
    }
}
