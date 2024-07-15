package Functions;

import java.util.Scanner;

public class sum_of_two_num {
    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b =  sc.nextInt();

        System.out.println("the sum is : "+ a+b);
    }
    public static void main(String[] args) {
        sum();
    }
}
