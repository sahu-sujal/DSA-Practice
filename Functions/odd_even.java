package Functions;

import java.util.Scanner;

public class odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("the numb is : " + check(num));
    }
    static String check(int num){
        if (num % 2 == 0) {
            return " EVEN";
        }else{
            return "OOD";
        }
    }
}
