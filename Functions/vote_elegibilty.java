package Functions;

import java.util.Scanner;

public class vote_elegibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        eligible(age);
    }

    static void eligible(int age){
        if(age >= 18){
            System.out.println("he/she is eligible to vote");
        }else{
            System.out.println("he/she isn't eligible to vote");
        }
    }
}
