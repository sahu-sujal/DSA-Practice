package Functions;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        prime(num);
    }

    static void prime(int num){
        int count = 0;
        for(int i = 2; i*i <= num; i++){
            if (num % i == 0) {
                count++;
                System.out.println("Not Prime");
                
            }

            
        }
        if (count == 0) {
            System.out.println("Prime");
        }
        
    }
}
